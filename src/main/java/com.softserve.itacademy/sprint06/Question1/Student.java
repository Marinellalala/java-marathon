package com.softserve.itacademy.sprint06.Question1;

class Student extends Person {
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYear) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYear;
    }

    public void setStudyPlace(String studyPlace) {
        this.studyPlace = studyPlace;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }
}
