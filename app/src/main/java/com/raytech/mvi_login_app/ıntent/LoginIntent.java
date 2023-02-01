package com.raytech.mvi_login_app.ıntent;

public class LoginIntent {

    public final String username;
    public final String password;

    public LoginIntent(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
