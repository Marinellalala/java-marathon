package com.java.marathon.sprint06_ClassDesignPolymorphism.Test.Q7;

public class Example {
    public static void output(int a){
        System.out.println(1);
    }

    public static void output(Integer a){
        System.out.println(2);
    }

    public static void output(double a){
        System.out.println(3);
    }

    public static void main(String[] args) {
        output(3);
    }


}
