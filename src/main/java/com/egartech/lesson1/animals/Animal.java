package com.egartech.lesson1.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void voice() {
        System.out.println(name + " voice");
    }

}
