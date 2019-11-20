package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> spisok = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            spisok.add(reader.readLine());
        }
        int min = spisok.get(0).length();
        int max = spisok.get(0).length();
        for (int i = 1; i < spisok.size(); i++) {
            if (spisok.get(i).length() < min)
                min = spisok.get(i).length();
            if (spisok.get(i).length() > max)
                max = spisok.get(i).length();
        }
        for (int i = 0; i < spisok.size(); i++) {
            if (spisok.get(i).length() == min || spisok.get(i).length() == max ) {
                System.out.println(spisok.get(i));
                break;
            }
        }
    }
}
