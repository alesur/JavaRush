package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(CheckCoordinate(a, b));

    }

    private static int CheckCoordinate(int a, int b) {
        int result=0;
        if (a>0 && b>0){ result=1;}
        if (a<0 && b>0){ result=2;}
        if (a<0 && b<0){ result=3;}
        if ( a>0 && b<0){ result=4;}
        return result;
    }
}

