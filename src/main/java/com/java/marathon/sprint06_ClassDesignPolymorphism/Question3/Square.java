package com.java.marathon.sprint06_ClassDesignPolymorphism.Question3;

public class Square {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        return 4 * getWidth();
    }
}
