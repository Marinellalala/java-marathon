package com.softserve.itacademy.sprint05.Question2;

import java.util.Calendar;

public class Student extends User {

    protected int year;

    public Student(int year, String name, String surname) {
        super(name, surname);
        this.year = year;
    }

    public int getCourseNumber() {
        Calendar localCalendar = Calendar.getInstance();
        Integer currentYear = localCalendar.get(Calendar.YEAR);
        Integer courseNumber = currentYear - this.year + 1;
        if (courseNumber >= 1 && courseNumber <= 6) {
            return courseNumber;
        } else {
            return -1;
        }
    }
}