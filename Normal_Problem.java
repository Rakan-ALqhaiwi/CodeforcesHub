package com.mycompany.normal_problem;

import java.util.Scanner;

public class Normal_Problem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String a = in.next();
            String b = "";
            for (int j = a.length() - 1; j >= 0; j--) {
                if (a.charAt(j) == 'p') {
                    b += "q";
                } else if (a.charAt(j) == 'q') {
                    b += "p";
                } else {
                    b += "w";
                }
            }
            System.out.println(b);
        }
    }
}
