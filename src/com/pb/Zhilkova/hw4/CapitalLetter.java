package com.pb.Zhilkova.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Input text: ");
            String s = in.nextLine();

            String [] words = s.split("\\s+");
            String snew = "";

            for (int i = 0; i < words.length; i++) {
            snew = snew + words[i].substring(0,1).toUpperCase() + words[i].substring(1)+" ";
            }

            System.out.println(snew.trim());
    }
}

