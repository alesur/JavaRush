package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int digitCheck = Integer.valueOf(input);
        if (digitCheck > 0) {
            System.out.println(digitCheck * 2);
        }
        if (digitCheck < 0) {
            System.out.println(digitCheck + 1);
        }
        if (digitCheck == 0) {
            System.out.println(digitCheck);
        }
    }

}