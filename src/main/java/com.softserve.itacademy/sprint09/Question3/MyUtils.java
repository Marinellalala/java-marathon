package com.softserve.itacademy.sprint09.Question3;

//Pig Latin is a spoken "secret code" that many English-speaking children learn.
//        The rules for written Pig Latin are:
//        If a word begins with a consonant cluster, move it to the end and add "ay";
//        If a word begins with a vowel, add "hay" to the end;
//        Write a String pigLatinConverter(String text) method of the MyUtils class to convert input text.
//        For example, for a given text
//        Pig Latin is simply a form of jargon unrelated to Latin.
//        you should get
//        igPay atinLay ishay implysay ahay ormfay ofhay argonjay unrelatedhay otay atinLay.
//        For more information, see https://en.wikipedia.org/wiki/Pig_Latin

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {

    public static final String VOWEL = "(\\b([aeiouAEIOU]))\\w*";
    public static final String CONSONANT = "\\b((?![aeiouAEIOU])([a-zA-Z]))\\w*";

    public String pigLatinConverter1(String text) {
        Pattern vowelPattern = Pattern.compile(VOWEL);
        Matcher matcher = vowelPattern.matcher(text);
//        text = matcher.replaceAll(matchResult -> matchResult.group() + "hay");

        Pattern consonantPattern = Pattern.compile(CONSONANT);
        matcher = consonantPattern.matcher(text);
//        text = matcher.replaceAll(matchResult ->
//                matchResult.group().replaceAll("^([^aeiouAEIOU]*)(.+)", "$2$1ay"));
        return text;
    }

}
