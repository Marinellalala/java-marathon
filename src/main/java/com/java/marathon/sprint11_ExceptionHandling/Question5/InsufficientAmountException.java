package com.java.marathon.sprint11_ExceptionHandling.Question5;

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
