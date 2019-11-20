package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listMod3 = new ArrayList<Integer>();
        ArrayList<Integer> listMod2 = new ArrayList<Integer>();
        ArrayList<Integer> listElse = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                listMod3.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                listMod2.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
                listElse.add(list.get(i));
            }
        }
        printList(listMod3);
   //     System.out.println("--");
        printList(listMod2);
        printList(listElse);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach((x)-> System.out.println(x));
    }
}
