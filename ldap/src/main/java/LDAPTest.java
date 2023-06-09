import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;

public class LDAPTest {


    public static void main(String[] args) {
//        String javaHome = System.getProperty("java.home");
//        String keystore = javaHome+"/lib/security/cacerts";
//        System.out.println("java.home,url:"+keystore);

        NewLdap ldap=new NewLdap();
        ldap.refshLdap();

//        String  userName = "Alukman";
//        String  passWord = "123456";
//        CtLdap.checkPasswd(userName,passWord);
//


    }


}
