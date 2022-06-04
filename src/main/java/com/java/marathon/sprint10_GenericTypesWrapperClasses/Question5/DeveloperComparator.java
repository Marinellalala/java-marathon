package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question5;

import java.util.Comparator;

public class DeveloperComparator implements Comparator<Developer> {

    public int compare(Developer a, Developer b) {
        EmployeeComparator employeeComparator = new EmployeeComparator();
        int compareAsEmployee = employeeComparator.compare(a, b);
        if (compareAsEmployee == 0) {
            return Integer.compare(a.getLevel().ordinal(), b.getLevel().ordinal());
        } else {
            return compareAsEmployee;
        }
    }
}
