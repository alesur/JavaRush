package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int whichYear = Integer.valueOf(input);
        yearCheker(whichYear);

    }

    private static void yearCheker(double whichYear) {


        if (((whichYear / 400) % 1 == 0)) {
            System.out.println("количество дней в году: 366");
        } else {
            if ((whichYear / 100) % 1 == 0) {
                System.out.println("количество дней в году: 365");
            }
            else {
                if ((whichYear / 4) % 1 == 0) {
                    System.out.println("количество дней в году: 366");
                }
                else{
                    System.out.println("количество дней в году: 365");
                }
            }

        }
    }
}