package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        while (number>=1){
            System.out.println(word);
            number--;
        }

    }
}
