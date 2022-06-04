package com.java.marathon.sprint14_JavaStreamAPI.Question5;

//Create a Stream<Integer> duplicateElements(Stream<Integer> stream) method of the MyUtils class to return a sorted stream of duplicated elements of the input stream.
//        For example, for a given elements
//        [3, 2, 1, 1, 12, 3, 8, 2, 4, 2]
//        you should get
//        [1, 2, 3]

import java.util.*;
import java.util.stream.Stream;

public class MyUtils {
    public Stream<Integer> duplicateElements(Stream<Integer> stream) {

        Set<Integer> items = new HashSet<>();
        return stream.filter(Objects::nonNull).filter(n -> !items.add(n)).filter(Objects::nonNull).distinct().sorted();
    }

    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        myUtils.duplicateElements(Stream.of(3, 2, 1, 1, 12, 3, 8, 2, 4, 2)).forEach(System.out::println);
    }
    }

