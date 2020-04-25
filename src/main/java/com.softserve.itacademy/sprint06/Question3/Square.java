package com.softserve.itacademy.sprint06.Question3;

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
