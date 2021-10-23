package com.pb.Zhilkova.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        System.out.println("Guess the number from 1 to 100, you have 5 tries. Do you want to play?");
        System.out.println("To exit the program, enter - exit.");

        final int MAX_ATTEMPT = 5;   // кол-во попыток ввода числа
        int attempt = 0;             //счетчик попыток
        //int number = 35;             // задуманное число

        Scanner in = new Scanner(System.in);
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Tries " + attempt + ":");
            String usersAnswer = in.next();
            int operand = Integer.parseInt(usersAnswer);

            if (operand >= 0 && operand <= 34) {
                System.out.println("The number is bigger than you thought. Try again. Hint: this number is divisible by 5. Input number:");
            } else if (operand >= 36 && operand <= 100) {
                System.out.println("The number is less than you thought.Try again. Hint: this number is divisible by 5. Input number:");
            } else if (operand == 35) {
                System.out.println("Bingo!!! You are lucky. Number = 35. You guessed from " + attempt + "tries!");
                break;
            } else if (operand < 0 || operand > 100) {
                System.out.println("Input a number from 1 to 100:");
                continue;
            } else if (usersAnswer.equals("exit")) {
                System.out.println("See you later");
                break;
            }
            System.out.println("The end");
        }
    }
}

