package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question2;

public class ArrayUtils {

    public static <T> T setAndReturn(T[] array, T value, int position){
        return array[position] = value;
    }
}
