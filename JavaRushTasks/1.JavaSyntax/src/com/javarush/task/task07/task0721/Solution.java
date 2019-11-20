package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int[] list = new int[20];
        int scan = Integer.valueOf(reader.readLine());
        minimum = scan;
        maximum = scan;
        for (int i = 0; i < 19; i++) {
            scan = Integer.valueOf(reader.readLine());
            list[i]=scan;
            if (scan >= maximum) {
                maximum = scan;
            }
            if (scan <= minimum) {
                minimum = scan;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
