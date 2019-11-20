package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> masif = new ArrayList<String>();
        masif.add("adin");
        masif.add("dva");
        masif.add("tri");
        masif.add("cetire");
        masif.add("piat");

        System.out.println(masif.size());
        for(int i=0; i<masif.size(); i++)
            System.out.println(masif.get(i));
    }
}
