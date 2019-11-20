package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        tenTimes("Я хочу большую зарплату, и для этого изучаю Java");
    }
    public static void tenTimes(String s){
        for (int i = 1; i<=10; i++){
            System.out.println(s);
        }
    }
}
