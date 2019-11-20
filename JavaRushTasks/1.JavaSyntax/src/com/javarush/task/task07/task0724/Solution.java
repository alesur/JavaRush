package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human one = new Human("Vasia", true, 15);
        Human two = new Human("Zenia", false, 20);
        Human three = new Human("Mitia", true, 10);
        Human four = new Human("John", false, 5);

        Human five = new Human("John", false, 5, three, four);
        Human six = new Human("John", false, 5, three, four);
        Human seven = new Human("John", false, 5, one, two);
        Human eight = new Human("John", false, 5, six, seven);
        Human nine = new Human("John", false, 5, five, eight);

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(five.toString());
        System.out.println(six.toString());
        System.out.println(seven.toString());
        System.out.println(eight.toString());
        System.out.println(nine.toString());
    }

    public static class Human {
       String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}