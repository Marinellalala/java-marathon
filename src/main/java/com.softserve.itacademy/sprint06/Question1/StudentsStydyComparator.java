package com.softserve.itacademy.sprint06.Question1;

import java.util.Comparator;

class StudentsStydyComparator implements Comparator<Student>{

    public int compare(Student a, Student b){

        if(a.getStudyYears()> b.getStudyYears())
            return 1;
        else if(a.getStudyYears()< b.getStudyYears())
            return -1;
        else
            return 0;
    }
}