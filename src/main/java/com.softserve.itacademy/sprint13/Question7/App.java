package com.softserve.itacademy.sprint13.Question7;

// Create the method readFile(String filename) that read from file a sequence of bytes in binary format from previous
// task and return ridable string.
//
//        For example, the sequence of 7-bit bytes
//
//
//        should be represented as text fragment:


import sun.misc.FloatingDecimal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static String readFile(String filename) {
        String str = "";
        String binary = "";
        try (FileReader fileReader = new FileReader(filename)) {
            int b = 0;
            while ((b = fileReader.read()) != -1) {
                binary += (char) b;
            }
            byte[] bytes = new byte[binary.length() / 7];
            for (int i = 0; i < binary.length() / 7; i++) {
                bytes[i] = (byte) (int) Integer.parseInt(binary.substring(i * 7, (i + 1) * 7), 2);
            }
            str = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(readFile("text.txt"));
//        String text = "Hello";
//        byte[] arr = text.getBytes();
//        System.out.println(Arrays.toString(arr));
//        String file = "110100011001011101100110110011011110100001";
    }
}
