import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewLdap {


    public void refshLdap() {

        LdapUser ldapUser = new LdapUser();
//        ldapUser.setLDAP_HOST("10.22.62.92");
//        ldapUser.setLDAP_PORT(389);
//        ldapUser.setLDAP_USERNAME("cn=superman,ou=People,dc=exim,dc=com");
//        ldapUser.setLDAP_PASSWORD("123456");
//        ldapUser.setLDAP_BASE_DN("dc=exim,dc=com");
//        ldapUser.setLDAP_USER_OBJECT_CLASS("inetOrgPerson");0
//        ldapUser.setLDAP_SYNC_USER_OBJECT_FILTER("(objectClass=inetOrgPerson)");
//        ldapUser.setLDAP_BASE_GROUPS("ou=groups");
//        ldapUser.setLDAP_BASE_USERS("ou=users");
//        ldapUser.setLDAP_PROTOCOL(false);

//        ldapUser.setLDAP_HOST("szad-SUNLINEAD-CA"); // 10.22.50.8
//        ldapUser.setLDAP_PORT(636);
//        ldapUser.setLDAP_USERNAME("szad\\administrator");
//        ldapUser.setLDAP_PASSWORD("Sunline%2019");
//        ldapUser.setLDAP_BASE_DN("DC=szad,DC=sunline");
//        ldapUser.setLDAP_USER_OBJECT_CLASS("*");
//        ldapUser.setLDAP_SYNC_USER_OBJECT_FILTER("(objectClass=*)");
//        ldapUser.setLDAP_BASE_GROUPS("ou=groups");
//        ldapUser.setLDAP_BASE_USERS("OU=测试");
//        ldapUser.setLDAP_PROTOCOL(false);

        ldapUser.setLDAP_HOST("10.10.20.156"); // 10.22.50.8
        ldapUser.setLDAP_PORT(389);
        ldapUser.setLDAP_USERNAME("cn=Manager,dc=sunline,dc=cn");
        ldapUser.setLDAP_PASSWORD("sunline");
        ldapUser.setLDAP_BASE_DN("dc=sunline,dc=cn");
        ldapUser.setLDAP_USER_OBJECT_CLASS("user");
        ldapUser.setLDAP_SYNC_USER_OBJECT_FILTER("(objectclass=inetorgperson)");
        ldapUser.setLDAP_BASE_GROUPS("ou=People");
        ldapUser.setLDAP_BASE_USERS("ou=Group");
        ldapUser.setLDAP_PROTOCOL(false);

        ldapOp(ldapUser);
    }


    public void ldapOp(LdapUser ldap) {

//        AuthSet authSet = new AuthSet();
//        authSet.setSettingsId(ldap.getId());
//        authSet  = authSetDao.selectOne(authSet);

//        final Long authSetId = authSet.getId();

        LDAPAuthentication authentication = new LDAPAuthentication();
        StringBuilder url = new StringBuilder();
        if(ldap.getLDAP_PROTOCOL()){
            url.append("ldaps://");
        }else {
            url.append("ldap://");
        }
        url.append(ldap.getLDAP_HOST());
        url.append(":");
        url.append(ldap.getLDAP_PORT());
        String userName = ldap.getLDAP_USERNAME();
        String password = ldap.getLDAP_PASSWORD();
        List<Map<String, String>> mapList = authentication.getUser(url.toString(), userName, password, ldap);
        if (mapList.size() == 0) {
            throw new RuntimeException("Ldap connection url: "+url+", get user list is null.");
        }
        List<User> list = new ArrayList<User>();
        String userCodeFild = ldap.getLDAP_USER_CODE_FIELDS()!=null? ldap.getLDAP_USER_CODE_FIELDS() : "cn";

        mapList.forEach(map -> {
            User user = new User();
            user.setUsername(map.get(userCodeFild));
            user.setName(map.get(ldap.getLDAP_USER_NAME_FIELDS()));
            user.setEmail(map.get(ldap.getLDAP_USER_EMAIL_FIELDS()));
            user.setType(SystemConstant.USER_TYPE_LDAP);
            list.add(user);
        });
        System.out.println(list);



    }
}
