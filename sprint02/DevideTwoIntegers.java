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
}