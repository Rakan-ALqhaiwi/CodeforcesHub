package com.mycompany.twins;

import java.util.Scanner;

/*
A. Circuit
time limit per test1 second
memory limit per test256 megabytes
Alice has just crafted a circuit with n
 lights and 2n
 switches. Each component (a light or a switch) has two states: on or off. The lights and switches are arranged in a way that:

Each light is connected to exactly two switches.
Each switch is connected to exactly one light. It's unknown which light each switch is connected to.
When all switches are off, all lights are also off.
If a switch is toggled (from on to off, or vice versa), the state of the light connected to it will also toggle.
Alice brings the circuit, which shows only the states of the 2n
 switches, to her sister Iris and gives her a riddle: what is the minimum and maximum number of lights that can be turned on?

Knowing her little sister's antics too well, Iris takes no more than a second to give Alice a correct answer. Can you do the same?

Input
Each test consists of multiple test cases. The first line contains a single integer t
 (1≤t≤500
) — the number of test cases. The description of the test cases follows.

The first line of each test case contains a single integer n
 (1≤n≤50
) — the number of lights in the circuit.

The second line of each test case contains 2n
 integers a1,a2,…,a2n
 (0≤ai≤1
) — the states of the switches in the circuit. ai=0
 means the i
-th switch is off, and ai=1
 means the i
-th switch is on.

Output
For each test case, output two integers — the minimum and maximum number of lights, respectively, that can be turned on.

 */
public class Circuit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a[] = new int[n * 2];

            for (int j = 0; j < 2 * n; j++) {
                a[j] = in.nextInt();
            }
            int x = 0;
            for (int j = 0; j < 2 * n; j++) {
                if (a[j] == 1) {
                    x++;
                }
            }
            int min = x % 2 == 0 ? 0 : 1;

            int max = Math.min(x, 2 * n - x);
            System.out.println(min + " " + max);

        }
    }
}
