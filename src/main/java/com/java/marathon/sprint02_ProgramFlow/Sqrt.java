package com.java.marathon.sprint02_ProgramFlow;

// Implement int sqrt(int x).
//
//        Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
//
//        Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

class SQRT {
    public static int mySqrt(int x) {
        long a = 0;
        while (a <= x) {
            if (a * a == x) {
                break;
            } else if (a * a > x) {
                a--;
                break;
            } else {
                a++;
            }
        }
        return (int) a;
    }
}