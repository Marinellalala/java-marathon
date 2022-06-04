package com.java.marathon.sprint16_exersices.other.shapes;

public abstract class Shape {
    String color = "red";

    public Shape(String color){
        this.color = color;
    }

    public abstract String draw();
}
