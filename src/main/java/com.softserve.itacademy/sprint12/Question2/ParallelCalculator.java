package com.softserve.itacademy.sprint12.Question2;

import java.util.function.BinaryOperator;

public class ParallelCalculator implements Runnable{
    private BinaryOperator<Integer> binaryOperator;
    private int operand1;
    private int operand2;
    public int result;

    public ParallelCalculator(BinaryOperator<Integer> binaryOperator, int operand1, int operand2) {
        this.binaryOperator = binaryOperator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        result = binaryOperator.apply(operand1, operand2);
    }
}

