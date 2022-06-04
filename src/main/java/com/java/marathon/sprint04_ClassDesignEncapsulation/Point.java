package com.java.marathon.sprint04_ClassDesignEncapsulation;

// Question 5
// A Point class, which models a 2D point with x and y coordinates should contains:
//
//        Two private instance variables x and y  of int type.
//        A constructor that constructs a point with the given x and y coordinates.
//        A method getXYPair() which returns the x and y in a 2-element int array.
//        A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates.
//        An overloaded distance(Point point) method that returns the distance from this point to the given Point instance.
//        Another overloaded distance() method that returns the distance from this point to the origin (0, 0).

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair() {
        int[] arr = {this.x, this.y};
        return arr;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance;
    }

    public double distance(Point point) {
        double distance = Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distance;
    }
}
