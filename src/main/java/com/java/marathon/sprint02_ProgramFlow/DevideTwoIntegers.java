package com.java.marathon.sprint02_ProgramFlow;

//Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
//
//        Return the quotient after dividing dividend by divisor.
//
//        The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.

class DevideTwoIntegers {
    public int divide(int dividend, int divisor) {
        long rez = 1;
        boolean isDividentPositive = divisor > 0;
        boolean isDivisorPostive = dividend > 0;
        int maxInt = Integer.MAX_VALUE;
        boolean isRezPositive = (isDividentPositive && isDivisorPostive) || (!isDividentPositive && !isDivisorPostive);
        long divisorPoz = isDividentPositive ? divisor : (long) 0 - divisor;
        long dividendPoz = isDivisorPostive ? dividend : (long) 0 - dividend;
        long denominator = divisorPoz;
        while (dividendPoz > denominator) {
            denominator *= 2;
            rez *= 2;
        }
        while (denominator > dividendPoz) {
            denominator -= divisorPoz;
            rez -= 1;
        }
        if (!isRezPositive) {
            return (int) -rez;
        }
        if (rez > maxInt) {
            return maxInt;
        }
        return (int) rez;
    }

    public static int divide1(int dividend, int divisor) {
        boolean isNegative = false;
        long count = 0;
        if (dividend <= Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE;
        }
        if (dividend >= Integer.MAX_VALUE) {
            dividend = Integer.MAX_VALUE;
        }

        if (divisor < 0 && dividend < 0) {
            divisor = -1 * divisor;
            dividend = -1 * dividend;
        }
        if (divisor < 0) {
            isNegative = true;
            divisor = -1 * divisor;
        }
        if (dividend < 0) {
            isNegative = true;
            dividend = -1 * dividend;
        }

        long temp = divisor;
        while (temp <= dividend) {
            count++;
            temp += divisor;
        }
        if (isNegative) {
            count = -1 * count;
        }

        if (count <= Integer.MIN_VALUE || count >= Integer.MAX_VALUE) {
            count = Integer.MAX_VALUE;
        }

        return (int) count;
    }

    public static int divide2(int dividend, int divisor) {
        boolean isNegative = false;
        long count = 0;
      /*  if (dividend <= Integer.MIN_VALUE) {
            dividend = -1* Integer.MAX_VALUE;
        }
        if (dividend >= Integer.MAX_VALUE) {
            dividend = Integer.MAX_VALUE;
        }*/
        long rez;
        if (divisor < 0 && dividend < 0) {
            divisor = -1 * divisor;
            dividend = -1 * dividend;
        }
        if (divisor < 0) {
            isNegative = true;
            divisor = -1 * divisor;
        }
        if (dividend < 0) {
            isNegative = true;
            dividend = -1 * dividend;
        }

        long temp = divisor;
        while (temp <= dividend) {
            count++;
            temp += divisor;
        }
        if (isNegative) {
            rez = (int) (-1 * count);
        } else {
            rez = (int) count;
        }
        if (rez > Integer.MAX_VALUE) {
            rez = Integer.MAX_VALUE;
        }
        return (int) rez;
    }

    public int divide3(int dividend, int divisor) {
        boolean isNegative = false;
        long count = 0;
        long rez;
     /*    if (dividend <= Integer.MIN_VALUE) {
             dividend = -1*Integer.MAX_VALUE;
        }
         if (dividend >= Integer.MAX_VALUE) {
             dividend = Integer.MAX_VALUE;
        }  */

        if (divisor < 0 && dividend < 0) {
            divisor = -1 * divisor;
            dividend = -1 * dividend;
        }
        if (divisor < 0 && dividend > 0) {
            isNegative = true;
            divisor = -1 * divisor;
        }
        if (dividend < 0 && divisor > 0) {
            isNegative = true;
            dividend = -1 * dividend;
        }

        long temp = divisor;
        while (temp <= dividend) {
            count++;
            temp += divisor;
        }
        if (isNegative) {
            rez = -1 * count;
        } else {
            rez = count;
        }
        if (rez > Integer.MAX_VALUE) {
            rez = Integer.MAX_VALUE;
        }
        return (int) rez;
        // return isNegative ? (int)(-1 * count) : (int)count;
    }

    public int divide4(int dividend, int divisor) {
        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        long B = divisor;
        long A = dividend;

        int sign = -1;
        if ((A < 0 && B < 0) || (A > 0 && B > 0)) {
            sign = 1;
        }
        if (A < 0) A = A * -1;
        if (B < 0) B = B * -1;

        int ans = 0;
        long currPos = 1; // necessary to be long. Long is better for left shifting.
        while (A >= B) {
            B <<= 1;
            currPos <<= 1;
        }
        B >>= 1;
        currPos >>= 1;
        while (currPos != 0) {
            if (A >= B) {
                A -= B;
                ans |= currPos;
            }
            B >>= 1;
            currPos >>= 1;
        }
        return ans * sign;
    }

    public int divide5(int dividend, int divisor) {
        if (divisor == 0)
            return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        // get positive values
        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);

        int result = 0;
        while (pDividend >= pDivisor) {
            // calculate number of left shifts
            int numShift = 0;
            while (pDividend >= (pDivisor << numShift)) {
                numShift++;
            }

            // dividend minus the largest shifted divisor
            result += 1 << (numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            return result;
        } else {
            return -result;
        }
    }

    public int divide6(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        //get positive values
        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);

        int result = 0;
        while (pDividend >= pDivisor) {
            //calculate number of left shifts
            int numShift = 0;
            while (pDividend >= (pDivisor << numShift)) {
                numShift++;
            }

            //dividend minus the largest shifted divisor
            result += 1 << (numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            return result;
        } else {
            return -result;
        }
    }

}