package com.mycompany.army;

import java.util.Scanner;

public class Army {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d[] = new int[n - 1];
        int c = 0;
        for (int i = 0; i < d.length; i++) {
            d[i] = in.nextInt();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a - 1; i < b - 1; i++) {
            c += d[i];
        }
        System.out.println(c);

    }
}
