package com.java.marathon.sprint05_ClassDesignInheritance.Question3;

final class Fish extends Animal {

    public Fish(int age, double weight) {
        super(age, weight);
    }

    @Override
    public String move() {
        return "swim";
    }
}
