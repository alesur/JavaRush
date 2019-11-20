package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        orderHighToLow(a, b, c);
    }//psvm

    private static void orderHighToLow(int a, int b, int c) {
        System.out.println(findHigh(findHigh(a, b), c) + " " + ((a+b+c) - (findHigh(findHigh(a, b), c) + findLow(findLow(a, b), c)) + " " + findLow(findLow(a, b), c)));


    }

    private static int findHigh(int a, int b) {
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }

    private static int findLow(int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }
}//class