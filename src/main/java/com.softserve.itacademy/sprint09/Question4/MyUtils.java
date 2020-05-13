package com.softserve.itacademy.sprint09.Question4;

// Write a String differentWords(String originalText, String modifyText) method of the MyUtils
// class to compare originalText and modifyText.
//        The differentWords() method return the modified text with uppercase of additional words.
//        For example, for a given originalText
//        Java is a programming language that is class-based and designed to have as few implementation
//        dependencies as possible.
//        and modifyText
//        Java is a   general-purpose programming   language that is class-based object-oriented and
//        designed to have as few implementation dependencies as possible.
//        you should get
//        Java is a   GENERAL-PURPOSE programming   language that is class-based OBJECT-ORIENTED and
//        designed to have as few implementation dependencies as possible.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {

    public String differentWords(String originalText, String modifyText) {
        List<String> originalList = Arrays.asList(originalText.split("(\\W+)"));
        List<String> listOfDiff = Stream.of(modifyText.split("(\\W+)")).filter(w->!originalList.contains(w)).collect(Collectors.toList());
        for (String s : listOfDiff) {
            modifyText = modifyText.replaceFirst(s, s.toUpperCase());
        }
        return modifyText;
    }
}
