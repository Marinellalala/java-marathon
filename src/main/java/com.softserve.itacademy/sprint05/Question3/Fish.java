package com.softserve.itacademy.sprint05.Question3;

final class Fish extends Animal {

    public Fish(int age, double weight) {
        super(age, weight);
    }

    @Override
    public String move() {
        return "swim";
    }
}
