package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        for (int z = 1; z <= 10; z++) {
            int store = z;
            int hold = z;
            for (int i = 1; i <= 10; i++) {
                System.out.print(hold + " ");
                hold = hold + store;
            }
            System.out.println("");
        }
    }
}
