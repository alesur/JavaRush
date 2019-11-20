package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double count=0;
        double step = 0;
        while (true) {

            int input = Integer.parseInt(reader.readLine());

            if(input == -1){
                count = (count/step);
                System.out.println(count);
                break;
            }
            else{
                count = count + input;
                step++;
            }
        }
    }
}

