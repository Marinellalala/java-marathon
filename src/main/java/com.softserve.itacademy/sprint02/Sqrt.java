package com.softserve.itacademy.sprint02;

class SQRT {
    public int mySqrt(int x) {
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