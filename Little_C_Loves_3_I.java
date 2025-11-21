package com.mycompany.little_c_loves_3_i;

import java.util.Scanner;

public class Little_C_Loves_3_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 1;
        int c = (n - 2);
        if (c % 3 == 0) {
            b = 2;
            c = c - 1;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
