package com.softserve.itacademy.sprint05.Question3;

final class Bird extends Animal {

    public Bird(int age, double weight) {
        super(age, weight);
    }

    @Override
    public String move() {
        return "fly";
    }
}
