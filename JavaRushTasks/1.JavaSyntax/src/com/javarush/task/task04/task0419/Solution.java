package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        System.out.println(whoIsMax(whoIsMax(a, b), whoIsMax(c, d)));


    }

    private static int whoIsMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

}
