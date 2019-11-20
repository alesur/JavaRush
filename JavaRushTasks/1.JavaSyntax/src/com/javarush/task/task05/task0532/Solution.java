package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            n = Integer.parseInt(reader.readLine());
            if (n>0) {
                break;
            }
        }

        int maximum = Integer.parseInt(reader.readLine());
        for (int i = 1; i < n; i++) {
            int z = Integer.parseInt(reader.readLine());
            if (z>maximum){
                maximum = z;
            }
        }




        System.out.println(maximum);
    }
}
