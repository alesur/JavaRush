package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true) {

            int input = Integer.parseInt(reader.readLine());
            if (input == -1){
                count = count + input;
                System.out.println(count);
                break;
            }
            else{
               count = count + input;
            }
        }

    }
}
