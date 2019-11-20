package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double division(int a, int b) {
        double rezult = (double)a/(double)b;
        return rezult;
    }

    public static double percent(int a, int b) {
        double res = ((double)a*(double)b)/100;
        return res;
    }

    public static void main(String[] args) {
;
        System.out.println(Calculator.division(5, 4));
    }
}