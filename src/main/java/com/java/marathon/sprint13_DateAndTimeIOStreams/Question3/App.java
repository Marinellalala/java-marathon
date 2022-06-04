package com.java.marathon.sprint13_DateAndTimeIOStreams.Question3;

// Write a method to check if a year is a leap year or not, using for this the LocalDate class.
//
// If a year is leap then method should return true, otherwise - false.

import java.time.LocalDate;

public class App {
    public static boolean isLeapYear(int year) {
        LocalDate localDate = LocalDate.of(year, 01, 01);
        return localDate.isLeapYear();
    }
}
