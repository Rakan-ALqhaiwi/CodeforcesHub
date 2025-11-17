package com.mycompany.pangram;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String a = in.next().toLowerCase();
        String b = "abcdefghijklmnopqrstuvwxyz";
        boolean c = true;
        for (int i = 0; i < 26; i++) {
            if (!a.contains(String.valueOf(b.charAt(i)))) {
                c = false;
                break;
            }
        }
        System.out.println(c ? "YES" : "NO");
    }
}
