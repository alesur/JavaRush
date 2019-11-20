package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String snum = reader.readLine();
      //  int num = Integer.parseInt(snum);

        System.out.println(name + " захватит мир через " + snum + " лет. Му-ха-ха!");

    }
}
