package com.mycompany.divisibility_problem;

import java.util.Scanner;

public class Divisibility_Problem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            long d = a % b;
            if (d == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - d);
            }
        }
    }
}
