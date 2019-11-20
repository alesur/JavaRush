package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int z = 1;
        while (z <= 10) {
            int store = z;
            int hold = z;
            int i = 1;
            while (i <= 10) {
                System.out.print(hold + " ");
                hold = hold + store;
                i++;
            }
            System.out.println("");
            z++;
        }

    }
}
