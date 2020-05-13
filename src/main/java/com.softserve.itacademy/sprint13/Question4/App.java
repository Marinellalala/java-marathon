package com.softserve.itacademy.sprint13.Question4;

import org.joda.time.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class App {
    public static String getDateAfterToday(int years, int months, int days) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusYears(years);
        localDate = localDate.plusMonths(months);
        localDate = localDate.plusDays(days);
        return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
