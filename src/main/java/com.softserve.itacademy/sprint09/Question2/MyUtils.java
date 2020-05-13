package com.softserve.itacademy.sprint09.Question2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class MyUtils {

//    Given a text containing brackets  '(', ')', '{', '}', '[' and ']'.
//    Sequences "\\(", "\\)", "\\[", "\\]", "\\{" and "\\}" are not brackets.
//    Write a boolean verifyBrackets(String text) method of the MyUtils class to check a input text.
//    The brackets must close in the correct order, for example "()", "()[]{}", "{(())}" and "(\\()" are
//    all valid but "(]", ")(" and "([)]" are not.

    public boolean verifyBrackets(String text) {
        // Code
//        text.replaceAll("(\\\\\\(|\\\\\\)|\\\\\\]|\\\\\\[|\\\\\\{|\\\\\\})", "");
//        if(text.length()%2 != 0) return false;
//        for (int i = 0; i< text.length(); i++){
//            text.charAt(i);
//        }
//        return true;
        text =text.replaceAll("(\\\\\\(|\\\\\\)|\\\\\\]|\\\\\\[|\\\\\\{|\\\\\\})", "");
        Map<String, List<Integer>> m1 = new HashMap<>();
        m1.put("(", new ArrayList<>());
        m1.put(")", new ArrayList<>());
        m1.put("[", new ArrayList<>());
        m1.put("]", new ArrayList<>());
        m1.put("{", new ArrayList<>());
        m1.put("}", new ArrayList<>());

        List<String> collect = text.codePoints().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            m1.get(collect.get(i)).add(i);
        }
        for (int i = 0; i < m1.get("(").size(); i++) {
            if (m1.get(")").get(i) < m1.get("(").get(i) || ((m1.get(")").get(i) - m1.get("(").get(i))%2==0)) {
                return false;
            }
        }
        for (int i = 0; i < m1.get("[").size(); i++) {
            if (m1.get("]").get(i) < m1.get("]").get(i) || ((m1.get("]").get(i) - m1.get("[").get(i))%2==0)) {
                return false;
            }
        }
        for (int i = 0; i < m1.get("{").size(); i++) {
            if (m1.get("}").get(i) < m1.get("{").get(i) || ((m1.get("}").get(i) - m1.get("{").get(i))%2==0)) {
                return false;
            }
        }
        return true;
    }
}
