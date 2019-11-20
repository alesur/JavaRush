package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedaName = reader.readLine();
        Cat deda = new Cat(dedaName);

        String babaName = reader.readLine();
        Cat baba = new Cat(babaName);

        String papaName = reader.readLine();
        Cat papa = new Cat(papaName,null,deda);

        String mamaName = reader.readLine();
        Cat mama = new Cat(mamaName,baba,null);

        String sinaName = reader.readLine();
        Cat sina = new Cat(sinaName,mama,papa);
        String dociaName = reader.readLine();
        Cat docia = new Cat(dociaName,mama,papa);

/*        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName, dedaDad);
        */

        System.out.println(deda);
        System.out.println(baba);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(sina);
        System.out.println(docia);


    }

    public static class Cat {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mama, Cat papa) {
            this.name = name;
            this.mama = mama;
            this.papa = papa;
        }

        @Override
        public String toString() {
            if (mama == null && papa == null)
                return "The cat's name is " + name + ", no mother, no father";

            else if (mama == null && papa != null)
                return "The cat's name is " + name + ", no mother, father is " + papa.name;

            else if (mama != null && papa == null)
                return "The cat's name is " + name + ", mother is " + mama.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mama.name + ", father is " + papa.name;
        }
    }

}
