package com.softserve.itacademy.sprint05.Question3;

class Mammal extends Animal {

    public Mammal(int age, double weight) {
        super(age, weight);
    }

    @Override
    public final String move() {
        return "run";
    }
}
