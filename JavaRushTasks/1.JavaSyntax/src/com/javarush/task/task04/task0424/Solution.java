package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        whoIsDifferent(a, b, c);

    }

    private static void whoIsDifferent(int a, int b, int c) {
        if (a!=b && a==c){
            System.out.println(2);
        }
        if (a!=c && a==b){
            System.out.println(3);
        }
        if (b!=a && b==c){
            System.out.println(1);
        }
    }
}
