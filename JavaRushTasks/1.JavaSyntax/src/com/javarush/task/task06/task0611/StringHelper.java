package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s;
        for (int i = 1; i < 5; i++) {
            result = result + s;
        }
            return result;
        }

        public static String multiply (String s,int count){
            String resulta = s;
            int repit = count;
            for (int i = 1; i < repit; i++) {
                resulta = resulta + s;
            }
            return resulta;
        }


        public static void main (String[]args){

        }
}
