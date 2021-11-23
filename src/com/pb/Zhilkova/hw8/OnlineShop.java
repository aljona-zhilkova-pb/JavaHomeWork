package com.pb.Zhilkova.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Register on the site to enter.");
        System.out.println("Input login:");

        String login = scan.nextLine();
        System.out.println("Input password:");
        String password = scan.nextLine();
        System.out.println("Registration successful! Welcome to the site!");

        System.out.println("Input login:");
        System.out.println("Input password:");
        String confirmPassword = scan.nextLine();

        Auth auth = new Auth(login, password);


        try {
            auth.singUp(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Password or login does not meet requirements!" + e);
        } catch (WrongPasswordException e1) {
            System.out.println("Password or login does not meet requirements!" + e1);
        }

        try {
            auth.singIn(login, password);
        }catch (WrongLoginException e) {
            System.out.println("Password or login does not meet requirements!" + e + "Input login and password:");
        }catch (WrongPasswordException e1) {
            System.out.println("Password or login does not meet requirements!" + e1 + "Input login and password:");
        }
    }

}


