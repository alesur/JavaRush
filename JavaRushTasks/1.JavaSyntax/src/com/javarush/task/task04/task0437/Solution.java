package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for (int z=1;z<=i;z++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
