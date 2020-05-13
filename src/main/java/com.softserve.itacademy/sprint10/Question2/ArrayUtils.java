package com.softserve.itacademy.sprint10.Question2;

public class ArrayUtils {

    public static <T> T setAndReturn(T[] array, T value, int position){
        return array[position] = value;
    }
}
