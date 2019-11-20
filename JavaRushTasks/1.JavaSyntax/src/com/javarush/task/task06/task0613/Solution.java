package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat {
        static public int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}
