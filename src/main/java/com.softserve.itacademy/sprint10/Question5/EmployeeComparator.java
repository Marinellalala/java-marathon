package com.softserve.itacademy.sprint10.Question5;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee a, Employee b) {
        PersonComparator personComparator = new PersonComparator();
        int compareAsPerson = personComparator.compare(a, b);
        if (compareAsPerson == 0) {
            if (a.getSalary() > b.getSalary()) {
                return 1;
            } else if (a.getSalary() < b.getSalary()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return compareAsPerson;
        }
    }
}
