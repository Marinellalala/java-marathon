package com.java.marathon.sprint05_ClassDesignInheritance.Question4;

class Adult extends Person {
    String passportNumber;

    public Adult(int age, String healthInfo, String name, String passportNumber) {
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }
}