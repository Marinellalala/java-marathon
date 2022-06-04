package com.java.marathon.sprint06_ClassDesignPolymorphism.Question5;

interface DrinkReceipt {
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
