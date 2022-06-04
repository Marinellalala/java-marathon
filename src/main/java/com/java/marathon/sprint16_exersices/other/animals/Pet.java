package com.java.marathon.sprint16_exersices.other.animals;

public abstract class Pet {

    private String name;
    private int age;

    Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        while (age > 15) {
            System.out.println("Звери не могут быть старше 15 лет");
            age = age - 15;
        }
        this.age = age;
        this.voice();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 15) {
            System.out.println("Звери не могут быть старше 15 лет");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void voice();

}
