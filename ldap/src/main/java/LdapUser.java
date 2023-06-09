
public class LdapUser  {

    private static final long serialVersionUID = 2836525825436837603L;

    private String LDAP_BASE_DN;

    private String LDAP_BASE_GROUPS;

    private String LDAP_BASE_USERS;

    private Integer LDAP_CONN_TIMEOUT;

    private String LDAP_GROUP_DESC_FIELDS;

    private String LDAP_GROUP_MEMBERS_FIELD;

    private String LDAP_GROUP_OBJECT_CLASS;

    private String LDAP_GROUP_NAME_FIELDS;

    private String LDAP_HOST;

    private String LDAP_PASSWORD;

    private Integer LDAP_PORT;

    private Integer LDAP_READ_TIMEOUT;

    private Integer LDAP_SEARCH_TIMEOUT;

    private String LDAP_SYNC_GROUP_OBJECT_FILTER;

    private Integer LDAP_SYNC_INTERVAL;

    private String LDAP_SYNC_USER_OBJECT_FILTER;

    private String LDAP_USERNAME;

    private boolean LDAP_SYNC_USER_USE_MEMBEROF;

    private String LDAP_USER_NAME_FIELDS;

    private String LDAP_USER_CODE_FIELDS;

    private String LDAP_USER_GROUPS_FIELD;

    private String LDAP_USER_OBJECT_CLASS;

    private String LDAP_USER_EMAIL_FIELDS;

    private Boolean LDAP_PROTOCOL;

    public Boolean getLDAP_PROTOCOL() {
        return LDAP_PROTOCOL;
    }

    public void setLDAP_PROTOCOL(Boolean LDAP_PROTOCOL) {
        this.LDAP_PROTOCOL = LDAP_PROTOCOL;
    }

    public String getLDAP_USER_EMAIL_FIELDS() {
        return LDAP_USER_EMAIL_FIELDS;
    }

    public void setLDAP_USER_EMAIL_FIELDS(String LDAP_USER_EMAIL_FIELDS) {
        this.LDAP_USER_EMAIL_FIELDS = LDAP_USER_EMAIL_FIELDS;
    }

    public String getLDAP_BASE_DN() {
        return LDAP_BASE_DN;
    }

    public void setLDAP_BASE_DN(String LDAP_BASE_DN) {
        this.LDAP_BASE_DN = LDAP_BASE_DN;
    }

    public String getLDAP_BASE_GROUPS() {
        return LDAP_BASE_GROUPS;
    }

    public void setLDAP_BASE_GROUPS(String LDAP_BASE_GROUPS) {
        this.LDAP_BASE_GROUPS = LDAP_BASE_GROUPS;
    }

    public String getLDAP_BASE_USERS() {
        return LDAP_BASE_USERS;
    }

    public void setLDAP_BASE_USERS(String LDAP_BASE_USERS) {
        this.LDAP_BASE_USERS = LDAP_BASE_USERS;
    }

    public Integer getLDAP_CONN_TIMEOUT() {
        return LDAP_CONN_TIMEOUT;
    }

    public void setLDAP_CONN_TIMEOUT(Integer LDAP_CONN_TIMEOUT) {
        this.LDAP_CONN_TIMEOUT = LDAP_CONN_TIMEOUT;
    }

    public String getLDAP_GROUP_DESC_FIELDS() {
        return LDAP_GROUP_DESC_FIELDS;
    }

    public void setLDAP_GROUP_DESC_FIELDS(String LDAP_GROUP_DESC_FIELDS) {
        this.LDAP_GROUP_DESC_FIELDS = LDAP_GROUP_DESC_FIELDS;
    }

    public String getLDAP_GROUP_MEMBERS_FIELD() {
        return LDAP_GROUP_MEMBERS_FIELD;
    }

    public void setLDAP_GROUP_MEMBERS_FIELD(String LDAP_GROUP_MEMBERS_FIELD) {
        this.LDAP_GROUP_MEMBERS_FIELD = LDAP_GROUP_MEMBERS_FIELD;
    }

    public String getLDAP_GROUP_OBJECT_CLASS() {
        return LDAP_GROUP_OBJECT_CLASS;
    }

    public void setLDAP_GROUP_OBJECT_CLASS(String LDAP_GROUP_OBJECT_CLASS) {
        this.LDAP_GROUP_OBJECT_CLASS = LDAP_GROUP_OBJECT_CLASS;
    }

    public String getLDAP_GROUP_NAME_FIELDS() {
        return LDAP_GROUP_NAME_FIELDS;
    }

    public void setLDAP_GROUP_NAME_FIELDS(String LDAP_GROUP_NAME_FIELDS) {
        this.LDAP_GROUP_NAME_FIELDS = LDAP_GROUP_NAME_FIELDS;
    }

    public String getLDAP_HOST() {
        return LDAP_HOST;
    }

    public void setLDAP_HOST(String LDAP_HOST) {
        this.LDAP_HOST = LDAP_HOST;
    }

    public String getLDAP_PASSWORD() {
        return LDAP_PASSWORD;
    }

    public void setLDAP_PASSWORD(String LDAP_PASSWORD) {
        this.LDAP_PASSWORD = LDAP_PASSWORD;
    }

    public Integer getLDAP_PORT() {
        return LDAP_PORT;
    }

    public void setLDAP_PORT(Integer LDAP_PORT) {
        this.LDAP_PORT = LDAP_PORT;
    }

    public Integer getLDAP_READ_TIMEOUT() {
        return LDAP_READ_TIMEOUT;
    }

    public void setLDAP_READ_TIMEOUT(Integer LDAP_READ_TIMEOUT) {
        this.LDAP_READ_TIMEOUT = LDAP_READ_TIMEOUT;
    }

    public Integer getLDAP_SEARCH_TIMEOUT() {
        return LDAP_SEARCH_TIMEOUT;
    }

    public void setLDAP_SEARCH_TIMEOUT(Integer LDAP_SEARCH_TIMEOUT) {
        this.LDAP_SEARCH_TIMEOUT = LDAP_SEARCH_TIMEOUT;
    }

    public String getLDAP_SYNC_GROUP_OBJECT_FILTER() {
        return LDAP_SYNC_GROUP_OBJECT_FILTER;
    }

    public void setLDAP_SYNC_GROUP_OBJECT_FILTER(String LDAP_SYNC_GROUP_OBJECT_FILTER) {
        this.LDAP_SYNC_GROUP_OBJECT_FILTER = LDAP_SYNC_GROUP_OBJECT_FILTER;
    }

    public Integer getLDAP_SYNC_INTERVAL() {
        return LDAP_SYNC_INTERVAL;
    }

    public void setLDAP_SYNC_INTERVAL(Integer LDAP_SYNC_INTERVAL) {
        this.LDAP_SYNC_INTERVAL = LDAP_SYNC_INTERVAL;
    }

    public String getLDAP_SYNC_USER_OBJECT_FILTER() {
        return LDAP_SYNC_USER_OBJECT_FILTER;
    }

    public void setLDAP_SYNC_USER_OBJECT_FILTER(String LDAP_SYNC_USER_OBJECT_FILTER) {
        this.LDAP_SYNC_USER_OBJECT_FILTER = LDAP_SYNC_USER_OBJECT_FILTER;
    }

    public String getLDAP_USERNAME() {
        return LDAP_USERNAME;
    }

    public void setLDAP_USERNAME(String LDAP_USERNAME) {
        this.LDAP_USERNAME = LDAP_USERNAME;
    }

    public boolean isLDAP_SYNC_USER_USE_MEMBEROF() {
        return LDAP_SYNC_USER_USE_MEMBEROF;
    }

    public void setLDAP_SYNC_USER_USE_MEMBEROF(boolean LDAP_SYNC_USER_USE_MEMBEROF) {
        this.LDAP_SYNC_USER_USE_MEMBEROF = LDAP_SYNC_USER_USE_MEMBEROF;
    }

    public String getLDAP_USER_NAME_FIELDS() {
        return LDAP_USER_NAME_FIELDS;
    }

    public void setLDAP_USER_NAME_FIELDS(String LDAP_USER_NAME_FIELDS) {
        this.LDAP_USER_NAME_FIELDS = LDAP_USER_NAME_FIELDS;
    }

    public String getLDAP_USER_GROUPS_FIELD() {
        return LDAP_USER_GROUPS_FIELD;
    }

    public void setLDAP_USER_GROUPS_FIELD(String LDAP_USER_GROUPS_FIELD) {
        this.LDAP_USER_GROUPS_FIELD = LDAP_USER_GROUPS_FIELD;
    }

    public String getLDAP_USER_OBJECT_CLASS() {
        return LDAP_USER_OBJECT_CLASS;
    }

    public void setLDAP_USER_OBJECT_CLASS(String LDAP_USER_OBJECT_CLASS) {
        this.LDAP_USER_OBJECT_CLASS = LDAP_USER_OBJECT_CLASS;
    }

    public String getLDAP_USER_CODE_FIELDS() {
        return LDAP_USER_CODE_FIELDS;
    }

    public void setLDAP_USER_CODE_FIELDS(String lDAP_USER_CODE_FIELDS) {
        LDAP_USER_CODE_FIELDS = lDAP_USER_CODE_FIELDS;
    }
}