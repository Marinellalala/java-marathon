package com.softserve.itacademy.sprint12.Question2;

//Suppose, you have class from task1 ParallelCalculator that is able to execute an operation in separate thread.
//        It uses an implementation of Runnable for this.
//        Constructor of ParallelCalculator takes 3 parameters:
//        BinaryOperator<Integer> to define an operation that will be executed,
//        int operand1 and int operand2.
//        ParallelCalculator class has not private int result field where the result of the operation
//        is written when operation is executed.
//
//        You need to create Accountant class with a static method sum that takes 2 int parameters and
//        returns their sum. The sum must be evaluated in a separate thread (please, do not call run() method of ParallelCalculator. Use start() on Thread object). Use ParallelCalculator for this. Method sum doesn't throw any checked exceptions.
//        Using Thread.sleep() is unwelcomed in this task.


import java.util.function.BinaryOperator;

public class Accountant {

    public static int sum(int x, int y) {
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x + y;
            }
        };
        ParallelCalculator parallelCalculator = new ParallelCalculator(binaryOperator, x, y);
        Thread thread = new Thread(parallelCalculator);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return parallelCalculator.result;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
    }
}
