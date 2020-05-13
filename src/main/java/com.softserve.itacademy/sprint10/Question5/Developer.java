package com.softserve.itacademy.sprint10.Question5;

public class Developer extends Employee{
    private Level level;

    public Developer(String name, int age, double salary, Level level) {
        super(name, age, salary);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }


    @Override
    public String toString() {
        return "Developer{" +
                "level=" + level +
                "} " + super.toString();
    }
}
