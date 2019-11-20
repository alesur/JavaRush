package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        checkNumber(input);

    }

    private static void checkNumber(int input) {
        if (input >= 1 && input <= 999) {
            if (input % 2 == 0) {
                System.out.print("четное ");
                checkLength(input);
            } else {
                System.out.print("нечетное ");
                checkLength(input);
            }
        }
    }

    private static void checkLength(int input) {
        if (String.valueOf(input).length() == 1) {
            System.out.print("однозначное число");
        }
        if (String.valueOf(input).length() == 2) {
            System.out.print("двузначное число");
        }
        if (String.valueOf(input).length() == 3) {
            System.out.print("трехзначное число");
        }
    }
}
