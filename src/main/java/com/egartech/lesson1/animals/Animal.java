package com.egartech.lesson1.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public String getName() {
        return name;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void voice() {
        System.out.println(name + " voice");
    }

    public void hi() {
        System.out.println(" hi from Animal");
    }

}
