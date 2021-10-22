package com.pb.Zhilkova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        System.out.print("Input number1: ");
        String usersNumber1 = in.next();
        int operand1 = Integer.parseInt(usersNumber1);

        System.out.print("Input number2: ");
        String usersNumber2 = in.next();
        int operand2 = Integer.parseInt(usersNumber2);

        System.out.print("Сomputation sign");
        String usersSign = in.next();
        if ("+".equals(usersSign)) {
            System.out.print(operand1 + operand2);
        }
        if ("-".equals(usersSign)) {
            System.out.print(operand1 - operand2);
        }
        if ("*".equals(usersSign)) {
            System.out.print(operand1 * operand2);
        }
        if ("/".equals(usersSign)) {
            System.out.print(operand1 / operand2);
        } else if (operand1 / operand2 == 0){
                System.out.print("Wrong operation");
            }
        }

    }

