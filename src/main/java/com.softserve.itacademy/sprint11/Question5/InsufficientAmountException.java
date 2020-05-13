package com.softserve.itacademy.sprint11.Question5;

public class InsufficientAmountException extends Exception {
    double amount;

    public double getAmount() {
        return amount;
    }

    public InsufficientAmountException(double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return "Sorry, but you are short $" + getAmount();
    }
}
