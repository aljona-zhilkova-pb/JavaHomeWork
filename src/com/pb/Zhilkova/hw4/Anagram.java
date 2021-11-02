package com.pb.Zhilkova.hw4;

import java.util.Scanner;

public class Anagram {

    //System.out.println("Input text: ");
    Scanner in = new Scanner(System.in);
    String usersText = in.next();
    int text = Integer.parseInt(usersText);

    public String sort(String s){

        char[] text = s.toCharArray();
        java.util.Arrays.sort(text);
        return new String(text);
    }
    public boolean permutation(String s, String t){

    if(s.length() != t.length()) {
        return false;
    }
    return sort(s).equals(sort(t));
    }
}
