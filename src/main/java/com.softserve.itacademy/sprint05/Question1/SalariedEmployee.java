package com.softserve.itacademy.sprint05.Question1;

class SalariedEmployee extends Employee {

    @Override
    public String getFullInfo() {
        return "employeeID: " + this.employeeID + "; socialSecurityNumber" + this.socialSecurityNumber;
    }

    public SalariedEmployee(String employeeID, String socialSecurityNumber) {
        super(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    protected String socialSecurityNumber;
}
