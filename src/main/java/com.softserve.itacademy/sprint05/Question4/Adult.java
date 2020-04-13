package com.softserve.itacademy.sprint05.Question4;

class Adult extends Person {
    String passportNumber;

    public Adult(int age, String healthInfo, String name, String passportNumber) {
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }
}