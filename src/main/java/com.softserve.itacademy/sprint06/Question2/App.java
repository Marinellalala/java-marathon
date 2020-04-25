package com.softserve.itacademy.sprint06.Question2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> workers= new ArrayList<>();
        workers.add(new Employee("Ivan", 10, BigDecimal.valueOf(3000.00)));
        workers.add(new Manager ("Petro", 9, BigDecimal.valueOf(3000.00), 1.5));
        workers.add(new Employee  ("Stepan", 8, BigDecimal.valueOf(4000.00)));
        workers.add(new Employee  ("Andriy", 7, BigDecimal.valueOf(3500.00)));
        workers.add(new Employee  ("Ihor", 5, BigDecimal.valueOf(4500.00)));
        workers.add(new Manager   ("Vasyl", 8, BigDecimal.valueOf(2000.00), 2.0));
        MyUtils myUtils = new MyUtils();
        myUtils.largestEmployees(workers);
    }
}
