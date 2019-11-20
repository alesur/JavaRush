package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = checkIT(list);
    }

    private static ArrayList<String> checkIT(ArrayList<String> list) {
        for (int i = 1; i < list.size();i++){
            if (list.get(i-1).length() < list.get(i).length()){
            }
            else{
                System.out.println(i);
                break;
            }
        }
        return null;
    }
}

