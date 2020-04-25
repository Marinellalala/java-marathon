package com.softserve.itacademy.sprint08.Question1;

// Please, implement a static method getCount that takes an array of integers as the first parameter.
// The second parameter - a functional interface that works with integers and defines a condition.
// The method should return the count of elements in the array that satisfy the condition defined by the second argument.

import java.util.function.Predicate;

public class MyUtils {
    public static int getCount(int[] numbers, Predicate<Integer> predicate) {
        int count = 0;
        for (int i : numbers) {
            if (predicate.test(i)) {
                count++;
            }
        }
        return count;
    }
}
