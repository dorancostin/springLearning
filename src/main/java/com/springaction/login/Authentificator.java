package com.springaction.login;

/**
 * Created with IntelliJ IDEA.
 * User: madalina
 * Date: 10/17/12
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Authentificator {
    private String username;
    private String password;

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

    public boolean authentificate(String user, String pass){
        System.out.println("username = " + this.username);
        System.out.println("pass = " + this.password);
        return (this.username.equals(user) && this.password.equals(pass));
    };
}
