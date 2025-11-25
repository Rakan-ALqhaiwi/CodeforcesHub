package com.mycompany.ascii_art_contest;

import java.util.Arrays;
import java.util.Scanner;

public class ASCII_Art_Contest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int m = Math.max(a, b);
        m = Math.max(m, c);

        int n = Math.min(a, b);
        n = Math.min(n, c);

        if (m - n >= 10) {
            System.out.println("check again");
        } else {
            int arr[] = {a, b, c};
            Arrays.sort(arr);
            System.out.println("final " + arr[1]);
        }
    }
}
