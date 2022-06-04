package com.java.marathon.sprint16_exersices.other.girls;

import java.util.Objects;

public class Girl {
    public static int count;
    private String name;
    private int age;
    static {
        System.out.println("hi from static block");

    }

    {
        System.out.println("hi from non-static block");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void goToCinema() {
        System.out.println("Go go go!!" + name);
    }

    String goToRest(String restName) {
        if("Mac".equals(restName))
            return "No";
        else
            return "Yes";
    }

    public static int getCount() {
        return count++;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
