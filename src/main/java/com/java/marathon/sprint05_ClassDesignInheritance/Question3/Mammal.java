package com.java.marathon.sprint05_ClassDesignInheritance.Question3;

class Mammal extends Animal {

    public Mammal(int age, double weight) {
        super(age, weight);
    }

    @Override
    public final String move() {
        return "run";
    }
}
