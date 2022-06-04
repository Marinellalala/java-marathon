package com.java.marathon.sprint07_NestedInnerClassesEnums.Question3;

public class App {

    public static void addAtoB(int a, int b) {

        Strategy strategy = new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a + b;
            }
        };
        execute(a, b, strategy);
    }

    public static void subtractBfromA(int a, int b) {

        Strategy strategy = new Strategy() {
            @Override
            public double doOperation(int a, int b) {
                return a - b;
            }
        };
        execute(a, b, strategy);
    }

    public static void multiplyAbyB(int a, int b) {

        Strategy strategy = (a1, b1) -> a1 * b1;
        execute(a, b, strategy);
    }

    public static void divideAbyB(int a, int b) {

        Strategy strategy = (a1, b1) -> a1 / b1;
        execute(a, b, strategy);
    }

    public static void execute(int a, int b, Strategy strategy) {
        double result = strategy.doOperation(a, b);
        System.out.println(result);
    }

}
