package zw.co.loop.Tutorials.model;

public class User{
    public User(String userId, String userName, String userPassword, String userToken){
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userToken = userToken;
        }
    private String userId, userName, userPassword, userToken;

    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserToken() {
        return userToken;
    }
}
