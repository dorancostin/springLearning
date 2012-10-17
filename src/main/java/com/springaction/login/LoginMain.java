package com.springaction.login;

import com.springaction.login.Login;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: madalina
 * Date: 10/16/12
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Login loginObj = (Login) context.getBean("login");
        try{
            System.out.println("login1 :" + loginObj.authentificate("user1","pass1"));
            System.out.println("login2 :" + loginObj.authentificate("user2","pass2"));
            System.out.println("login3 :" + loginObj.authentificate(null,null));
        } catch (NullPointerException e){
            System.out.println("Incorrect username or password");
        }
    }
}
