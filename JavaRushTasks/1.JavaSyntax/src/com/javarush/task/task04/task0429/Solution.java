package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    private static int positive = 0;
    private static int negative = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        checkNumbers(a, b, c);
    }

    private static void checkNumbers(int a, int b, int c) {
        checkWhoisWho(a);
        checkWhoisWho(b);
        checkWhoisWho(c);
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }

    private static void checkWhoisWho(int a) {
        if (a>0) positive++;
        if (a<0) negative++;
    }
}
