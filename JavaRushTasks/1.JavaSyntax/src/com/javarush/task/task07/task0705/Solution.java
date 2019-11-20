package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] cisla = new int[20];
        int[] one = new int[10];
        int[] two = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < cisla.length; i++) {
            if (i < 10)
                one[i] = cisla[i];
            else
                two[i%10] = cisla[i];

        }
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);
        }

    }
}
