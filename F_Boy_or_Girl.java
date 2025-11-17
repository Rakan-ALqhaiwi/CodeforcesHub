/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.f_boy_or_girl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class F_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String m = in.next();
        Set<Character> d = new HashSet<>();
        for (int i = 0; i < m.length(); i++) {
            d.add(m.charAt(i));
        }
        if (d.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
