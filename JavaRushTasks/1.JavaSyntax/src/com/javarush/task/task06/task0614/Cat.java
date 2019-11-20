package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<String> cats = new ArrayList<>();

    public Cat(String name) {
        cats.add(name);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            new Cat("Vaska "+i);
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(cats.get(i));
        }

    }
}
