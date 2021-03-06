package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question5;

import java.util.Arrays;
import java.util.Comparator;

public class Utility {

    public static <T extends Person> void sortPeople(T[] persons, Comparator<? super T> comparator) {
        Arrays.sort(persons, comparator);
    }
}
