package com.java.marathon.sprint06_ClassDesignPolymorphism.Question1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan"));
        personList.add(new Student("Petro", "University", 3));
        personList.add(new Worker("Andriy", "Developer", 12));
        personList.add(new Student ("Stepan", "College", 4));
        personList.add(new Worker  ("Ira", "Manager", 8));
        personList.add(new Student  ("Ihor", "University", 4));
        MyUtils myUtils = new MyUtils();
        System.out.println(myUtils.maxDuration(personList));
    }
}
