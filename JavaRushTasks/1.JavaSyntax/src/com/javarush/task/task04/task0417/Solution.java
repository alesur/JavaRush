package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        checkWhoIsEqual(a, b, c);

    }

    private static void checkWhoIsEqual(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.print(a + " " + b + " " + c);
        }
        else {
            if (a==b){
                System.out.print(a + " " + b);
            }
            if (a==c){
                System.out.print(a + " " + c);
            }
            if (b==c){
                System.out.print(b + " " + c);
            }
        }
    }

}