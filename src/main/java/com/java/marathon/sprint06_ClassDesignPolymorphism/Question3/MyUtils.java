package com.java.marathon.sprint06_ClassDesignPolymorphism.Question3;

import java.util.List;

public class MyUtils {
    public double sumPerimeter(List<Square> firures) {
        double perimeter = 0;
        if(firures.size() == 0){
            return perimeter;
        }
        for (Square figure : firures) {
            perimeter += figure.getPerimeter();
        }
        return perimeter;
    }
}
