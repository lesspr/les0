package com.egartech.lesson1.animals;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void hi() {
        System.out.println("hi from cat");
        super.hi();
    }
}
