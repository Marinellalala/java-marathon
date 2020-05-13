package com.softserve.itacademy.sprint09.Question1;

enum RomanNumbers {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int number;

    RomanNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
