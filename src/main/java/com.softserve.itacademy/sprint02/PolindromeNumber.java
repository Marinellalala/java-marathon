package com.softserve.itacademy.sprint02;

class PolindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return x == reversed;
    }
}