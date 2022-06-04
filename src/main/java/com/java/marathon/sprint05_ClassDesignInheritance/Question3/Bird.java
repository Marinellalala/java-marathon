package com.java.marathon.sprint05_ClassDesignInheritance.Question3;

final class Bird extends Animal {

    public Bird(int age, double weight) {
        super(age, weight);
    }

    @Override
    public String move() {
        return "fly";
    }
}
