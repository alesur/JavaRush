package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intgr = Integer.parseInt(reader.readLine());
        return intgr;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double duble = Double.parseDouble(reader.readLine());
        return duble;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean bulen = Boolean.parseBoolean(reader.readLine());
        return bulen;

    }

    public static void main(String[] args) throws Exception {

    }
}
