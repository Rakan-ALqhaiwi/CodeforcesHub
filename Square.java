package com.mycompany.square;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (a == b && a == c && a == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
