package com.mycompany.word_capitalization;

import java.util.Scanner;

public class Word_Capitalization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  char ch = in.next().charAt(0);
        String a = in.next();

       
        char capital = Character.toUpperCase(a.charAt(0));
        
        System.out.println(capital+""+a.substring(1));
    }
}
