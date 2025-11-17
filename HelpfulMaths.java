package com.mycompany.twins;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c = in.next();
        String []a = c.split("\\+");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i>0) {
                System.out.print("+");
            }
            System.out.print(a[i]);
        }
        
    }

}
