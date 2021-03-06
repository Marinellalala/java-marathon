package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question5;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName()) != 0 ? a.getName().compareTo(b.getName()) : Integer.compare(a.getAge(), b.getAge());
    }
}
