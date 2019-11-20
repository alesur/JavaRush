package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int cube = 10;
        while(cube>=1) {
            int line = 10;
            while (line >= 1) {
                System.out.print("S");
                line--;
            }
            System.out.println();
            cube--;
        }
    }
}
