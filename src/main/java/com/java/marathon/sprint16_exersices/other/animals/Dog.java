package com.java.marathon.sprint16_exersices.other.animals;

public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(getName()+" is barking!"+"He is "+getAge()+" years old");
    }
}
