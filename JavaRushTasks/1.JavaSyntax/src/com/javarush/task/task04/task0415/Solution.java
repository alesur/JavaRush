package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input1 = reader.readLine();
        int a = Integer.valueOf(input1);
        String input2 = reader.readLine();
        int b = Integer.valueOf(input2);
        String input3 = reader.readLine();
        int c = Integer.valueOf(input3);

        checkIfTriangle(a, b, c);
    }

    private static void checkIfTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }

}