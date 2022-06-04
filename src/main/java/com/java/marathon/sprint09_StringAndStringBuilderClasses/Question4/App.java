package com.java.marathon.sprint09_StringAndStringBuilderClasses.Question4;

public class App {

    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        String orig = "Java is a programming language that is class-based and designed to have as few implementation dependencies as possible.";
        String modify = "Java is a   general-purpose programming   language that is class-based object-oriented and designed to have as few implementation dependencies as possible.";
        myUtils.differentWords(orig, modify);



    }

}
