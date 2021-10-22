package com.pb.Zhilkova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        String usersNumber = in.next();
        int number = Integer.parseInt(usersNumber);

        if (number >= 0 && number <= 14) {
        System.out.print("Your number on the range (0-14)");}
            if (number >= 15 && number <= 35) {
                System.out.print("Your number on the range (15-35)");}
            if (number >= 36 && number <= 50) {
                System.out.print("Your number on the range (36-50)");}
            if (number >= 51 && number <= 100) {
                System.out.print("Your number on the range (51-100)");
            } else {
            System.out.print("Your number is out of the range, try again");
            }
    }
}





