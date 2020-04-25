package com.softserve.itacademy.sprint06.Question3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Square> figures = new ArrayList<>();
        figures.add(new Square(4.00));
        figures.add(new Square(5.00));
        figures.add(new Rectang(2.00, 3.00));
        MyUtils myUtils = new MyUtils();
        System.out.println(myUtils.sumPerimeter(figures));
    }
}
