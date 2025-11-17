package com.mycompany.circle_of_apple_trees;

import java.util.Scanner;

public class Circle_of_Apple_Trees {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int maxApples = 0;

            // تجربة كل نقطة بداية
            for (int start = 0; start < n; start++) {
                boolean[] eaten = new boolean[n];

                int lastBeauty = -1;
                int count = 0;

                // نمر على الأشجار مرتين لتغطية كل الاحتمالات
                for (int j = 0; j < 5 * n; j++) {
                    int idx = (start + j) % n;
                    if (!eaten[idx] && arr[idx] > lastBeauty) {
                        eaten[idx] = true;
                        lastBeauty = arr[idx];
                        count++;
                    }

                }

                maxApples = Math.max(maxApples, count);
            }

            System.out.println(maxApples);
        }

    }

}
