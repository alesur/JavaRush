package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<arr.length-2; i++){
            arr[i]=reader.readLine();
        }
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}