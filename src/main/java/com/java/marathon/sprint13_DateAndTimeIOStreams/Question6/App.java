package com.java.marathon.sprint13_DateAndTimeIOStreams.Question6;

// Create the method writeFile(String filename, String text) that write the text to file as sequence of bytes in binary format.
// For example, the text fragment
// Hello!
//   should be represented in the file as a sequence of 7-bit bytes without spaces between them:
//
//  If less than 7 bits are required to represent the character then add to binary sequence leading zeros '0'.

import java.io.*;

public class App {
    public static void writeFile(String filename, String text) {
        String binaryStr = "";
        byte[] arr = text.getBytes();
        for (int i = 0; i<arr.length; i++){
            for(int j = 0; j < 7 - Integer.toBinaryString(arr[i]).length(); j++){
                binaryStr += "0";
            }
            binaryStr += Integer.toBinaryString(arr[i]);
        }
        File file = new File(filename);
        try {
           FileWriter fw = new FileWriter(file);
           fw.write(binaryStr);
           fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        writeFile("text.txt" , "hello!");
    }
}
