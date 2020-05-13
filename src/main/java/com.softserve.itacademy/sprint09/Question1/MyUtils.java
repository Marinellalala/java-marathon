package com.softserve.itacademy.sprint09.Question1;

// Create a String intToRoman(int number) method of the MyUtils class to convert integer to Roman numerals.
// The "number" must be positive and do not exceed 3999. Otherwise, throw an IllegalArgumentException.
//        For example, for a given sequence of integer numbers
//        5 9 19 91 3999
//        you should get
//        V IX XIX XCI MMMCMXCIX
//        For more information, see https://en.wikipedia.org/wiki/Roman_numerals
//        and http://www.onlineconversion.com/roman_numerals_advanced.htm

public class MyUtils {
    public String intToRoman(int number) {
        // Code
        String romanNumber = "";
        if(number<=0 || number>3999){
            throw new IllegalArgumentException();
        }
        while(number>= RomanNumbers.M.getNumber()){
            romanNumber += RomanNumbers.M;
            number -=1000;
        }
        if(number>=900){
            romanNumber += RomanNumbers.C;
            romanNumber += RomanNumbers.M;
            number -=900;
        } else if(number>=500){
            romanNumber += RomanNumbers.D;
            number -=500;
        }
        if(number>=400){
            romanNumber += RomanNumbers.C;
            romanNumber += RomanNumbers.D;
            number -=400;
        }
        while(number>=100){
            romanNumber += RomanNumbers.C;
            number -=100;
        }
        if(number>=90){
            romanNumber += RomanNumbers.X;
            romanNumber += RomanNumbers.C;
            number -=90;
        } else if(number>=50){
            romanNumber += RomanNumbers.L;
            number -=50;
        }
        if(number>=40){
            romanNumber += RomanNumbers.X;
            romanNumber += RomanNumbers.L;
            number -=40;
        }
        while(number>=10){
            romanNumber += RomanNumbers.X;
            number -=10;
        }
        if(number>=9){
            romanNumber += RomanNumbers.I;
            romanNumber += RomanNumbers.X;
            number -=9;
        } else if(number>=5){
            romanNumber += RomanNumbers.V;
            number -=5;
        }
        if(number>=4){
            romanNumber += RomanNumbers.I;
            romanNumber += RomanNumbers.V;
            number -=4;
        }
        while(number>0){
            romanNumber += RomanNumbers.I;
            number -=1;
        }
        return romanNumber;
    }
}
