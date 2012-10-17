package com.springaction.login;

/**
 * Created with IntelliJ IDEA.
 * User: madalina
 * Date: 10/16/12
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction implements Login{
   private Authentificator authentificator;
   public LoginAction(Authentificator authentificator){
        this.authentificator = authentificator;
   }


    public boolean authentificate(String user, String pass) {
        return authentificator.authentificate(user,pass);
    }
}
