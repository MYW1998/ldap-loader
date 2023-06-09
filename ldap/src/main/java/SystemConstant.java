
public class SystemConstant {

    private SystemConstant() {

    }

    public static final String REF = "$ref";

    public static final String PATHS = "paths";

    public static final String DEFINITIONS = "definitions";

    public static final String DESCRIPTION = "description";

    public static final String PARAMETERS = "parameters";

    public static final String RESPONSES = "responses";

    public static final String NAME = "name";

    public static final String REQUIRED = "required";

    public static final String SCHEMA = "schema";

    public static final String ADDITIONPROPERTIES = "additionalProperties";

    public static final String TYPE = "type";

    public static final String ITEMS = "items";

    public static final String PROPERTIES = "properties";

    public static final String APPLICATION_JSON = "application/json";

    public static final String JWT_SESSION_KEY = "jwt_session_key";
    public static final String API_SECRET = "secret"; // api访问秘钥

    public static final String USER_SESSION_KEY = "userSeesion";

    public static final String INITIAL_CONTEXT_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";

    public static final String SECURITY_AUTHENTICATION = "simple";

    // token相关
    public static final String IDENTITY = "identity";
    public static final String FRESH = "fresh";
    public static final String JTI = "jti";

    // 路由
    public static final String ROUTEURL = "/loader";

    // 公司标识
    public static final String COMPANY = "Sunline";

    // token类型
    public static final String TOKENTYPEACCESS = "access";
    public static final String TOKENTYPEREFRESH = "refresh";
    public static final Integer TOKENTREM = 360000;// 秒为单位

    public static final String ENCODING_UTF8 = "UTF-8";

    public static final int MAX_ENCRYPT_BLOCK = 512;

    // 认证模式local
    public static final String LOCAL = "local";

    public static final String OPENLDAPAU = "openLDAP";

    public static final String ROLEADMIN = "admin_role";

    public static final String ROLESUPER = "super_role";

    public static final String URLLOGIN = "/#/login";

    public static final String XEDSPAUTHORIZATION = "X-Edsp-Authorization";

    public static final String XEDSPAPIKEY = "X-Edsp-Apikey";

    // 默认命名空间
    public static final String DEFAULT = "default";

    // 压缩格式
    public static final String TARGZ = ".tar.gz";
    public static final String ZIP = ".zip";

    public static final String OPENLDAP = "openLDAP";

    public static final String LDAPFIXX = "ldap://";

    // 产品管理上传文件格式
    public static final String FILEJSON = "json";
    public static final String FILEYAML = "yaml";

    public static final String PROTOCOL_HTTPS = "https";
    public static final String PROTOCOL_HTTP = "http";
    public static final String PROTOCOL_HTTPS_SOCKET = "wss";
    public static final String PROTOCOL_HTTP_SOCKET = "ws";
    public static final String PROTOCOL_NFS = "nfs";
    public static final String PROTOCOL_FILE = "file";

    public static final String PROTOCOL_HTTPS_PREFIX = "https://";
    public static final String PROTOCOL_HTTP_PREFIX = "http://";
    public static final String PROTOCOL_HTTPS_SOCKET_PREFIX = "wss://";
    public static final String PROTOCOL_HTTP_SOCKET_PREFIX = "ws://";
    public static final String PROTOCOL_NFS_PREFIX = "nfs://";
    public static final String PROTOCOL_FILE_PREFIX = "file://";

    public static final String HEARTBEAT = "rpc_heartbeat_tag";
    public static final String HEARTBEATURL = "/api/_sunline_edsp_ping_";

    public static final String INSTANCEPOINT = "/api/instance";

    public static final String XEDSPNAMESPACE = "x-edsp-namespace";

    public static final String XEDSPLANGUAGE = "x-edsp-language";

    public static final String SWAGGERSUFIXX = "/swagger";

    // RSA解密
    public static final String KEY_ALGORITHM = "RSA";
    public static final int MAX_DECRYPT_BLOCK = 512;

    public static final String WEBSOCKET = "/websocket";

    public static final String DOT = "_dot_";

    public static final String SPOT = ".";

    public static final String IMAGES = "images";

    public static final String LOGOPNG = "logo.png";

    public static final String ICONPNG = "icon.png";

    public static final String BOTHPNG = "both.png";

    public static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    public static final String ESIGN = ".esign";

    public static final String TAR = ".tar";

    // 角色类型
    public static final Integer ROLE_SUPER_ADMIN = 1;
    public static final Integer ROLE_ADMIN = 2;
    public static final Integer ROLE_DEVELOPER = 3;
    public static final Integer ROLE_NORMAL = 4;

    // 静态文件安装路径
    public static final String INSTALLURL = "/modules/";

    public static final String USER_ADMIN = "admin";

    public static final String LOADER_UI = "loader-ui";
    public static final String EMIALTOKENTYPE = "restPassword";

    public static final String EMIALSUB = "Forgot Password";

    public static final String EMAILMESSAGE = " We heard that you lost your EDSP-Loader password. Sorry about that!\n\n"
            + "But don’t worry! You can use the following link to reset your password:\n\n"
            + "{{protocol}}{{serverUrl}}:{{port}}/#/login/resetpwd?token={{resetPassWordToken}}\n\n"
            + "If you don’t use this link within 3 hours, it will expire. "
            + "To get a new password reset link, visit {{protocol}}{{serverUrl}}:{{port}}/#/login/ForgotPwd\n\n"
            + "Thanks,\n" + "Your friends at EDSP-Loader\n";

    public static final String SYNC_RESOURCES_FAILD_MAIL_SUBJECT = "资源同步失败";

    public static final String SYNC_RESOURCES_FAILD_MAIL_CONTENT = "前端加载器同步资源失败:\n\n" + "包名：{{packageName}}\n"
            + "类型：{{type}}\n" + "源主机：{{sourceHost}}\n" + "目标主机:{{targetHost}}\n" + "失败时间：{{faildTime}}\n"
            + "重试次数：{{retryCount}}\n\n" + "请检查失败原因并重试更新。";

    public static final String MODULES = "modules";

    public static final String SECURITYWAY = "defaultSecurity";

    public static final String DBENCRYPT = "encrypt";

    public static final String DBDECRYPT = "decrypt";

    public static final int SOCKET_TIMEOUT = 1000;

    public static final String USER_TYPE_LOCAL = "local";

    public static final String USER_TYPE_LDAP = "openLDAP";

    public static final Long DEFAULT_NUMBER = 1L;

    // 集群ip和端口存放key
    public static final String IPANDPORT = "ipandkey";

    // 子模块ui压缩包存放路径
    public static final String UIPATH = "uipath";

    /**
     * 所有接口同一加上 /loader 前缀
     */
    private static final String API_PREFIX = "/loader";

    public static final String ADDMODULEURL = API_PREFIX + "/api/uiModule/clusterModuleAdd/";

    public static final String DELETEMODULEURL = API_PREFIX + "/api/uiModule/clusterModuleDelete/";

    public static final String ADDIMAGES = API_PREFIX + "/api/settings/clusterAddImage/";

    public static final String SEND_WEBSOCKET_MSG = API_PREFIX + "/api/socket";

    public static final String INSTALL = "install";

    public static final String DELETE = "delete";

    public static final String LOGO = "logo";

    public static final String ICON = "icon";

    public static final String BOTH = "both";

    public static final String LISTPROXY = "listProxy";

    public static final String TEMP = "temp";

    public static final String WINDOWS = "windows";

    public static final String DEFAULTTARGETAPI = "defaultTargetApi";

    public static final String ENDAT = "endAt";

    public static final String MODULECODE = "moduleCode";

    public static final String MODULEPROJECT = "moduleProject";

    public static final String PKGBASENAME = "pkgBaseName";

    public static final String PROXYURLS = "proxyUrls";

    public static final String SUCCEED = "succeed";

    public static final String UNZIP = "unzip";

    public static final String TLS = "TLS";

    public static final String MODULEPROJECTS = "moduleProjects";

    public static final String LICENSE_COMPANY = "com";
    public static final String LICENSE_TYPE_CODE = "licenseTypeCode";
    public static final String LICENSE_DESC = "description";
    public static final String LICENSECODE = "licenseCode";
    public static final String LICENSE_TYPE = "licenseType";
    public static final String LICENSE_NUMBER = "number";
    public static final String LICENSE_APPLY_DATE = "applyAt";
    public static final String LICENSE_CLUSTER_NUMBER = "clusterNumber";


    public static final String PRODUCTS = "products";

    public static final String PRODUCTCODE = "productCode";

    public static final String USER_AUTH_LIST = "USER_AUTH_LIST";

    public static final String MONGOSYNC = "mongosync";

    /**
     * 考虑到loader需要兼容其他子模块的返回编码，设置默认返回值=0
     */
    public static final Object DEFAULT_RESP_SUCC_CODE = 0;

    // 替换字符串
    public static final String DEFAULT_SPECIAL_STR = "******";

}