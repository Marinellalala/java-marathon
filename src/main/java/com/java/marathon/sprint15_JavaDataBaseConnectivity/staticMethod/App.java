package com.java.marathon.sprint15_JavaDataBaseConnectivity.staticMethod;

public class App {

    static int num = 0;
    int a = 1;

    public static void main(String[] args) {

    }

    public static void staticMet(){
        num++;
//        a++;
//        nonStaticMethod();
    }

    public void nonStaticMethod(){
        num++;
        a++;
    }
}
