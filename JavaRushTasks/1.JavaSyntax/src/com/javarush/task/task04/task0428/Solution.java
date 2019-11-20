package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    private static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        checkNumbers(a, b, c);

    }

    private static void checkNumbers(int a, int b, int c) {
        checkPositive(a);
        checkPositive(b);
        checkPositive(c);
        System.out.println(count);
    }

    private static void checkPositive(int a) {
        if (a>0) count ++;
    }


}
