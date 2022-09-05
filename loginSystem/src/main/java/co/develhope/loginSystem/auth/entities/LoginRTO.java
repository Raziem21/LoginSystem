package co.develhope.loginSystem.auth.entities;

import co.develhope.loginSystem.user.entities.User;

public class LoginRTO {

    private User user;
    private String JWT;

    public LoginRTO() {}

    public LoginRTO(User user, String JWT) {
        this.user = user;
        this.JWT = JWT;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setJWT(String JWT) {
        this.JWT = JWT;
    }

    public String getJWT() {
        return JWT;
    }
}
