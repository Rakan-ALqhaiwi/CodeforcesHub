package com.mycompany.mahmoud_and_ehab_and_the_even.odd_game;

import java.util.Scanner;

public class Mahmoud_and_Ehab_and_the_evenOdd_game {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("Mahmoud");
                break;
            case 1:
                System.out.println("Ehab");
                break;

        }
    }
}
