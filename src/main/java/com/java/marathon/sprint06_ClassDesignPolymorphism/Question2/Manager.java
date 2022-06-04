package com.java.marathon.sprint06_ClassDesignPolymorphism.Question2;

import java.math.BigDecimal;

public class Manager extends Employee {
    private double coefficient;

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public BigDecimal getPayment() {
        return super.getPayment().multiply(BigDecimal.valueOf(coefficient));
    }
}
