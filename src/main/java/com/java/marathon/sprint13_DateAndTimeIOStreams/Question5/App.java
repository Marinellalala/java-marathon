package com.java.marathon.sprint13_DateAndTimeIOStreams.Question5;

// Write a method to read from a file a character-oriented data and return these data as String object.
//        For example, next fragment:
// This is text fragment
// that contains some text data
// and can be read!
//        after reading will be transform to the next String object:
//        "This is text fragment\nthat contains some text data\nand can be read!"


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static String readFile(String filename) {
        String line = null;
        String finalLine = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            while ((line = bufferedReader.readLine()) != null) {
                finalLine += (line + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalLine;
    }
}
