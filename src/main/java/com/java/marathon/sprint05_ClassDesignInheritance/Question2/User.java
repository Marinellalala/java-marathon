package com.java.marathon.sprint05_ClassDesignInheritance.Question2;

public class User {
    protected String name;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected String surname;

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
