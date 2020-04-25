package com.softserve.itacademy.sprint06.Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {
        List<Student> students = new ArrayList<>();
        List<Worker> workers = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Student) {
                students.add((Student) person);
            }
            if (person instanceof Worker) {
                workers.add((Worker) person);
            }
        }
            Student maxStudent = Collections.max(students, new StudentsStydyComparator());
            Worker maxWorker = Collections.max(workers, new WorkersExpirienceComparator());
            personList.add(maxStudent);
            personList.add(maxWorker);
        return personList;
    }
}
