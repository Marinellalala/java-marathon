package com.java.marathon.sprint05_ClassDesignInheritance;

public class Dog extends Animal implements Mammal{
    public void eat() {
        System.out.println("Dog is eating...");
    }
    public void bark() {
        System.out.println("Gow gow!");
    }

}
