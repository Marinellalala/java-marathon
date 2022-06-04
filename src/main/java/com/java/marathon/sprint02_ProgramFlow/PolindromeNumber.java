package com.java.marathon.sprint02_ProgramFlow;

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

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

    public boolean isPalindrome1(int x) {
        if (x < 10) {
            return false;
        }
     /*   String str="";
        while(x>10){
            str+=x%10;
            x/=10;
        }
        str+=x;
        // String str = String.valueOf(x);
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }*/
        int temp = x;
        int reversed = 0;
        while (temp > 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }
        return x == reversed;
    }

    public boolean isPalindrome2(int x) {
        boolean isPolindrom = true;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPolindrom = false;
                break;
            }
        }
        return isPolindrom;
    }
}