package classes;

public class OAuthClient {
    private Integer user_id;
    private String name;
    private String secret;
    private Boolean personal_access_client;
    private Boolean password_client;
    private Boolean revoked;
    private String updated_at;
    private String created_at;
    private Integer id;

    public OAuthClient(){}
    public OAuthClient(Integer user_id, String name, String secret, Boolean personal_access_client, Boolean password_client, Boolean revoked, String updated_at, String created_at, Integer id){
        this.user_id = user_id;
        this.name = name;
        this.secret = secret;
        this.personal_access_client = personal_access_client;
        this.password_client = password_client;
        this.revoked = revoked;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setPersonal_access_client(Boolean personal_access_client) {
        this.personal_access_client = personal_access_client;
    }

    public void setPassword_client(Boolean password_client) {
        this.password_client = password_client;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getSecret() {
        return secret;
    }

    public Boolean getPersonal_access_client() {
        return personal_access_client;
    }

    public Boolean getPassword_client() {
        return password_client;
    }

    public Boolean getRevoked() {
        return revoked;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Integer getId() {
        return id;
    }
}
