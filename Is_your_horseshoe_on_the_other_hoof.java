package com.mycompany.is_your_horseshoe_on_the_other_hoof;

import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 0;
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean a = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    a=true;
                    break;
                }
            }
            if (!a) {
              c++;  
            }
        }
        System.out.println(4-c);
    }
}
