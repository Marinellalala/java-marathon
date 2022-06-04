package com.java.marathon.sprint13_DateAndTimeIOStreams.Question1;

//Write a method to convert date and time, represented via Date object to object of Calendar type.

import java.util.Calendar;
import java.util.Date;

public class App {
    public static Calendar convertDateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
        // Write your code here

    }
}
