package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static int catcount = 0;
    public static int dogcount = 0;
    public static void main(String[] args) {

       int dogcount = 0;
        for (int i=1; i<=500_000; i++){
            new Cat();
            new Dog();
        }
    }
}

class Cat {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Solution.catcount++;
        System.out.println(Solution.catcount++ + " Cats was destroyed");
    }
}

class Dog {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Solution.dogcount++;
        System.out.println(Solution.dogcount + "Dogs was destroyed");
    }
}
