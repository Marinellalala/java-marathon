package com.java.marathon.sprint09_StringAndStringBuilderClasses.Question5;

//Write a String reformatLines(String text) method of the MyUtils class to replacing all
// spaces with one and reformat lines of input text.
//        Length of every lines should not exceed 60 characters.
//        For example, for a given text
//        Java    was      originally developed
//        by    James   Gosling at Sun Microsystems (which
//        has since been
//        acquired by Oracle) and released in 1995
//        as a core component of Sun Microsystems' Java platform.
//        you should get
//        Java was originally developed by James Gosling at Sun
//        Microsystems (which has since been acquired by Oracle) and
//        released in 1995 as a core component of Sun Microsystems'
//        Java platform.

public class MyUtils {


    public String reformatLines(String text) {
    return text.replaceAll("\n", " ")
        .replaceAll("^\\s+|\\s+$|\\s+(?=\\s)", "")
            .replaceAll("(.{60})", "$1\n");
//        .replaceAll("(\\b.{0,60}\\b\\W?)", "$1\n");
    }
}
