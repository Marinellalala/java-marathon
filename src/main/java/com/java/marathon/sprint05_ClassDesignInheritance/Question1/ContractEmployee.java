package com.java.marathon.sprint05_ClassDesignInheritance.Question1;

class ContractEmployee extends Employee {
    @Override
    public String getFullInfo() {
        return "employeeID: " + this.employeeID + "; federalTaxIDMember: " + this.federalTaxIDMember;
    }

    public ContractEmployee(String employeeID, String federalTaxIDMember) {
        super(employeeID);
        this.federalTaxIDMember = federalTaxIDMember;
    }

    protected String federalTaxIDMember;
}
