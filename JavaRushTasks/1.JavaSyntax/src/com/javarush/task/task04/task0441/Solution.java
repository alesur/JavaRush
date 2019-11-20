package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(findMinimum(findMinimum(findMax(a, b), findMax(b, c)), findMax(a, c)));

    }

    private static int findMinimum(int a, int b) {
        if (a <= b) {
            return a;
        } else
            return b;
    }

    private static int findMax(int a, int b) {
        if (a >= b) {
            return a;
        } else
            return b;
    }
}
