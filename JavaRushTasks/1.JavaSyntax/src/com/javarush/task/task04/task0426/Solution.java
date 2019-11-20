package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        checkNumber(input);

    }

    private static void checkNumber(int input) {
        if (input < 0){
            System.out.print("отрицательное ");
            ifOddOrEven(input);
        }else if(input > 0){
            System.out.print("положительное ");
            ifOddOrEven(input);
        }else if(input==0){
            System.out.println("ноль");
        }


    }

    private static void ifOddOrEven(int input) {
        if(input % 2 == 0){
            System.out.print("четное число");
        }else{
            System.out.print("нечетное число");
        }
    }
}
