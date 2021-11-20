package com.pb.Zhilkova.hw8;

import java.util.regex.Pattern;

public class Auth {

    String login;
    String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void singUp(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException {

            if (!Pattern.matches("[a-zA-Z_0-9] {5,20}", login)) {
                this.login = login;
            } else {
                throw new WrongLoginException("Login does not meet requirements!");  //не соотв требов
            }
            if (!Pattern.matches("[a-zA-Z_0-9] {5,}", password)) {
                throw new WrongPasswordException("Password does not meet requirements!"); //не соотв требов
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password does not match!");   //не совпадает
            } else {
                this.password = password;
                System.out.println("Registration successful! Welcome to the site!");
            }
        }

    public void singIn(String log, String pass)
        throws WrongLoginException, WrongPasswordException {
            System.out.println("Enter login:");
            System.out.println("Enter password:");

            if (!login.equals(log) || !password.equals(pass)) {
                throw new WrongLoginException("Wrong password or login");
            } else {
                System.out.println("Welcome to the site!");
            }
        }
}
