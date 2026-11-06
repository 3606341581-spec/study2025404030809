package project;

public class User {
    private String username;
    private String password;
    private String idcard;
    private String phonenumber;

    public User(){
    }

    public User(String username,String password,String idcard,String phonenumber){
        this.username = username;
        this.password = password;
        this.idcard = idcard;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
