package com.java.marathon.sprint06_ClassDesignPolymorphism.Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        List<Shape> maxShape = new ArrayList<>();
        List<Rectangle> rectangles = shapes.stream().filter(o-> o instanceof Rectangle).map(shape -> (Rectangle) shape).distinct().collect(Collectors.toList());
        if(!rectangles.isEmpty()) {
            rectangles = rectangles.stream().collect(Collectors.groupingBy(Rectangle::getArea, TreeMap::new, Collectors.toList())).lastEntry().getValue();
        }
        List<Rectangle> circles = shapes.stream().filter(o-> o instanceof Rectangle).map(shape -> (Rectangle) shape).distinct().collect(Collectors.toList());
        if(!circles.isEmpty()) {
            circles = circles.stream().collect(Collectors.groupingBy(Rectangle::getArea, TreeMap::new, Collectors.toList())).lastEntry().getValue();
        }
        maxShape.addAll(rectangles);
        maxShape.addAll(circles);
        return maxShape;
    }
}
