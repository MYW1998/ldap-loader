import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.Control;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;



public class LDAPAuthentication implements Serializable {

    private static final long serialVersionUID = 9146206493053003642L;

    private static final Control[] connCtls = null;

    private transient LdapContext ctx = null;

    private String uid = "";

    private String pswd = "";

    private String uidField = "cn";

    public LDAPAuthentication() {
    }


    public LDAPAuthentication(String uid, String pswd) {
        this.uid = uid;
        this.pswd = pswd;
    }

    public LDAPAuthentication(String uid, String pswd,String uidField) {
        this.uid = uid;
        this.pswd = pswd;
        this.uidField = (uidField==null) ? "cn":uidField;
    }


    /**
     * ldap认证
     *
     * @param
     */

    public boolean ldapConnect(String url, String userName, String password,Boolean ssl) {
        boolean result = false;
        Hashtable<String, String> env = getEnv(url, userName, password,ssl);
        try {
            this.ctx = new InitialLdapContext(env, connCtls);

            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * 数据处理
     *
     * @param
     * @return
     */
    public Hashtable<String, String> getEnv(String url, String userName, String password,Boolean ssl) {
        Hashtable<String, String> env = new Hashtable<String, String>();
        //完整的ldap路径
        String providerUrl = url;
        //用户名
        env.put(Context.INITIAL_CONTEXT_FACTORY, LdapConstat.INITIAL_CONTEXT_FACTORY);
        env.put(Context.PROVIDER_URL, providerUrl);
        env.put(Context.SECURITY_AUTHENTICATION, LdapConstat.SECURITY_AUTHENTICATION);
        env.put(Context.SECURITY_PRINCIPAL, userName);    //cn=admin,dc=yfb,dc=sunline,dc=cn
        env.put(Context.SECURITY_CREDENTIALS, password);
        if(ssl){
            env.put(Context.REFERRAL, "ignore");
            env.put(Context.SECURITY_PROTOCOL, "ssl");
            env.put("java.naming.ldap.factory.socket", "cn.sunline.edsp.loader.common.ldap.DummySSLSocketFactory");
        }

        return env;
    }

    /**
     * 根据uid查询UserDN
     */
    public String getUserDN(String uid, String url, String userName, String password, String baseDN,Boolean ssl) {
        StringBuilder userDN = new StringBuilder();
        boolean flag = ldapConnect(url, userName, password,ssl);
        if (!flag) {
            System.out.println("失败");
        }
        try {
            String baseDn = baseDN;
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration<SearchResult> en = this.ctx.search(baseDn, "("+uidField+"="+uid+")", constraints);
            if (en == null || !en.hasMoreElements()) {
                //logger.warn("未找到用户{}", uid);

                return userDN.toString();
            }
            //拼装userDN
            while (en.hasMoreElements()) {
                Object obj = en.nextElement();
                if (obj instanceof SearchResult) {
                    SearchResult si = (SearchResult) obj;
                    userDN.append(si.getName());
                    userDN.append( "," + baseDn);
                }
            }
            return  userDN.toString();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
        return userDN.toString();
    }

    public boolean authenricate(String url, String userName, String password, String baseDN,Boolean ssl) {
        boolean valide = false;
        String userDN = "";
        try {
            userDN = getUserDN(this.uid, url, userName, password, baseDN,ssl);
            if (userDN.equals(null)) {
                System.out.println("userDN:{"+userDN+"}");
                ctx.addToEnvironment(Context.SECURITY_PRINCIPAL, userDN);
                ctx.addToEnvironment(Context.SECURITY_CREDENTIALS, this.pswd);
                ctx.reconnect(connCtls);

                valide = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ctx.close();
            } catch (NamingException e) {
                System.out.println(e.getMessage());
            }
        }
        return valide;
    }

    public String getUserName() {
        return this.uid;
    }

    public String getPassword() {
        return this.pswd;
    }

    public List<Map<String, String>> getUser(String url, String userName, String password, LdapUser ldap) {
        List<Map<String, String>> results = new ArrayList<Map<String, String>>();
        boolean flag = ldapConnect(url, userName, password,ldap.getLDAP_PROTOCOL());
        if (!flag) {
            return results;
        }
        try {
            if (ctx != null) {
                SearchControls searchCtls = new SearchControls();
                searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
                String searchFilter = ldap.getLDAP_SYNC_USER_OBJECT_FILTER() ;
                String searchBase = ldap.getLDAP_BASE_DN();
                NamingEnumeration<SearchResult> answer = ctx.search(searchBase, searchFilter, searchCtls);
                Attributes oAttrs = null;
                if (answer != null) {
                    /**
                     * hasMore 方法，容易有bug
                     */
                    while (answer.hasMoreElements()) {
                        Map<String, String> result = new HashMap<String, String>();
                        SearchResult sr = answer.next();
                        System.out.println(sr.getName());
                        oAttrs = sr.getAttributes();
                        NamingEnumeration<?> ids = oAttrs.getIDs();
                        /**
                         * hasMore 方法，容易有bug
                         */
                        while (ids.hasMoreElements()) {
                            String attID = ids.next().toString();
                            String attValue = getLdapValue(oAttrs, attID);
                            result.put(attID, attValue);
                            System.out.println("{"+attID+"}={"+attValue+"}");
                        }
                        results.add(result);
                    }
                }
            }
        } catch (NamingException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (ctx != null)
                ctx.close();
        } catch (NamingException e) {
            System.out.println(e.getMessage());
        }

        return results;
    }


    public  String getLdapValue(Attributes oAttrs, String proname)
            throws NamingException {
        String result ="";
        Attribute attrpro = oAttrs.get(proname);
        if (attrpro == null) {
            return result;
        }
        NamingEnumeration<?> attrpros = attrpro.getAll();
        try {
            while (attrpros.hasMore()) {
                return attrpros.next()+"";
            }
        } catch (NamingException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public String getUidField() {
        return uidField;
    }

    public void setUidField(String uidField) {
        this.uidField = uidField;
    }
}