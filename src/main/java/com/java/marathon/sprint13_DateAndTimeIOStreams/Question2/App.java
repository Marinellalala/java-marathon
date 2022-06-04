package com.java.marathon.sprint13_DateAndTimeIOStreams.Question2;

//nWrite a method to get the name of last day of the given month in given year.
//
//        Use GregorianCalendar class to solve this exercise.
//
//        The name of day must corresponds next format: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
//        If month isn't correct then name is "Wrong Month".

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static String lastDayOfMonth(int month, int year) {
        if(month <0 || month>11){
            return "Wrong Month";
        }
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String dayName = "";
        switch (day){
            case 1: dayName = "Sunday";
            break;
            case 2: dayName = "Monday";
            break;
            case 3: dayName = "Tuesday";
            break;
            case 4: dayName = "Wednesday";
            break;
            case 5: dayName = "Thursday";
            break;
            case 6: dayName = "Friday";
            break;
            case 7: dayName = "Saturday";
            break;
        }
        return dayName;
    }

    public static void main(String[] args) {
        System.out.println(lastDayOfMonth(Calendar.MARCH, 1995));
    }
}
