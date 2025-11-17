/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.yet_another_array_problem;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Yet_Another_Array_Problem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            long arr[] = new long[n];
            arr[0] = in.nextLong();
            long g = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j] = in.nextLong();
                g = gcd(g, arr[j]);
            }
            long answer = -1;
            for (long x = 2; x <= 1_000_000; x++) {
                if (gcd(x, g) == 1) {
                    answer = x;
                    break;
                }
            }
            System.out.println(answer);
        }
    }

    static long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }

}
