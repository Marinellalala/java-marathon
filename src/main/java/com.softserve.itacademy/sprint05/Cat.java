package com.softserve.itacademy.sprint05;

public class Cat extends Animal{
    public void eat() {
        super.eat();
        System.out.println("Cat is eating...");
    }
    public void meow() {
        System.out.println("Meow Meow!");
    }

}
