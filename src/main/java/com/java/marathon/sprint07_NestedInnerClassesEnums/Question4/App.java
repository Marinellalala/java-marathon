package com.java.marathon.sprint07_NestedInnerClassesEnums.Question4;

public class App {
    public static String drawLine(LineType lineType) {
        return "The line is " + lineType.getLineType() + " type";
    }

    public static void main(String[] args) {
        System.out.println(App.drawLine(LineType.SOLID));
    }
}
