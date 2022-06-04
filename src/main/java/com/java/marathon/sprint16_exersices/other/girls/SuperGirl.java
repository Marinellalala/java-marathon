package com.java.marathon.sprint16_exersices.other.girls;

public class SuperGirl extends Girl1 {
    public static int getCount() {
        return count;
    }

    public static int count;
    String superPower;

    public SuperGirl(String name, int age, String superPower) {
        super(name, age);
        this.superPower = superPower;
        count++;
    }

    @Override
    public String toString() {
        return "SuperGirl{" +
                "superPower='" + superPower + '\'' +
                "} " + super.toString();
    }
}
