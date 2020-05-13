package com.softserve.itacademy.sprint10.Question5;

public class App {

    public static void main(String[] args) {
        Employee employee = new Employee("Nick", 27, 2850.55);
        Employee employee1 = new Employee("Sara", 24, 2950.35);
        Employee employee2 = new Employee("Bart", 38, 3165.75);
        Employee employee3 = new Employee("Nick", 21, 1940.25);
        Employee employee4 = new Employee("Sara", 24, 2260.65);
        Employee employee5 = new Employee("Bart", 38, 3165.75);

        Employee[] employees = {employee, employee1, employee2, employee3, employee4, employee5};

        EmployeeComparator employeeComparator = new EmployeeComparator();

        Utility.sortPeople(employees, employeeComparator);
    }
}
