package com.java.marathon.sprint05_ClassDesignInheritance.Question3;

abstract class Animal {
    int age;
    double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract String move();
}
