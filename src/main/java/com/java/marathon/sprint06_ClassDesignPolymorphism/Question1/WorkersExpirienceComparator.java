package com.java.marathon.sprint06_ClassDesignPolymorphism.Question1;

import java.util.Comparator;

class WorkersExpirienceComparator implements Comparator<Worker> {
    public int compare(Worker a, Worker b){
        if(a.getExperienceYears()> b.getExperienceYears())
            return 1;
        else if(a.getExperienceYears()< b.getExperienceYears())
            return -1;
        else
            return 0;
    }

}
