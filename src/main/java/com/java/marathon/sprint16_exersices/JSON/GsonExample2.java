//package com.softserve.itacademy.exersices.JSON;
//
//import com.google.gson.Gson;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//
//// JSON to Java Objects
//// In Gson, we can use gson.fromJson to convert JSON back to Java objects.
//
//public class GsonExample2 {
//
//    public static void main(String[] args) {
//
//        Gson gson = new Gson();
//
//        try (Reader reader = new FileReader("c:\\test\\staff.json")) {
//
//            // Convert JSON File to Java Object
//            Staff staff = gson.fromJson(reader, Staff.class);
//
//            // print staff
//            System.out.println(staff);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
