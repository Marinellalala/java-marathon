package com.softserve.itacademy.sprint05.Question1;

abstract class Employee {
    protected String employeeID;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public abstract String getFullInfo();
}
