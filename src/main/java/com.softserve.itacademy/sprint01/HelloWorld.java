package com.softserve.itacademy.sprint01;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Q1
    }

    // Q2
    public static float doubleNumber(double number) {
        float a = (float) number;
        return 2*a;
    }

    // Q3
    public static int century(int year) {
        int century;
        if (year % 100 == 0) {
            century = (year / 100);
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }

    // Q4
    public static int sumOfDigits(int number) {
        return (number % 10) + (number / 10) % 10 + (number / 100);
    }

    // Q5
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (!(year % 100 == 0)) {
                isLeapYear = true;
            }
        }
        if (year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }


}

