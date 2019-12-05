package zw.co.loop.Tutorials.model;

public class Auth {
    public String userId, userName, authToken;

    public Auth(String email, String userName, String authToken) {
        this.userId = userId;
        this.userName = userName;
        this.authToken = authToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
