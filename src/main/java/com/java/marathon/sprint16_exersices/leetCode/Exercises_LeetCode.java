package com.java.marathon.sprint16_exersices.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises_LeetCode {

    public static void main(String[] args) {
//        String[] str = new String[]{"flower","flow","flights"};
//        longestCommonPrefix(str);

//        int[] intArr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(removeDuplicates(intArr));
//        System.out.println(maxBlock("hoopla"));
//        int[] num = new int[]{1, 3, 1, 4};
//        count(5);

        String str1 = "555 Straight Stave Ave, San Francisco, CA 94104";
        String str2 = "444 Ave Maria Stairway St., San Francisco, CA 94104";
        String str3 = "9032 Flave Steep Str, San Francisco, CA 94104";

        System.out.println(changeAddress(str1));
        System.out.println(changeAddress(str2));
        System.out.println(changeAddress(str3));
    }

//    1. Two Sum
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

//    14. Longest Common Prefix
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String smallestStr = "";
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].length() < strs[i + 1].length()) {
                smallestStr = strs[i];
            } else {
                smallestStr = strs[i + 1];
            }
        }
        for (int i = 0; i < smallestStr.length() - 1; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(smallestStr.substring(0, i + 1))) break;
            }
            prefix = prefix + smallestStr.charAt(i);
        }
        System.out.println(prefix);
        return prefix;
    }

    public static int removeDuplicates(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                for (int j = 1; j < nums.length; j++) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                count++;
            }
        }
        return count;
    }

    public static int maxBlock(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        String[] out = str.split("(?<=(.))(?!\\1)");
        Integer[] lenghts = new Integer[out.length];
        for (int i = 0; i < out.length; i++) {
            lenghts[i] = out[i].length();
        }
        Arrays.sort(lenghts);
        return lenghts[lenghts.length - 1];
    }


    // Use a recursion to display all the numbers from the 1st to the entered.
    // count(5) 1,2,3,4,5
    public static void count(int num) {
//        if (num == 1){
//            System.out.println(num);
//            return;
//        }
//        count(num - 1);
//        System.out.println(num);

        if (num > 1){
            count(num - 1);
        }
        System.out.println(num);
    }


    // change the address abbreviation to a full word in 2 ways, on of them RegExp
//    Ave -> Avenue
//    String str1 = "555  Straight Stave Ave, San Francisco, CA 94104";
//        String str2 = "444 Ave Maria Stairway St., San Francisco, CA 94104";
//        String str3 = "9032 Flave Steep Str, San Francisco, CA 94104";
    public static String changeAddress(String str){
        Map<String, String> values = new HashMap<>(Map.of(
                "Ave", "Avenue",
                "Ave.", "Avenue",
                "St", "Street",
                "St.", "Street",
                "Str", "Street",
                "Str.", "Street"));

        String[] arr = str.replace(",", " ,").split(" ");
        for (int i=0; i<arr.length; i++) {
            for (Map.Entry<String, String> value : values.entrySet()) {
                if (arr[i].equals(value.getKey())) {
                    arr[i] = value.getValue();
                }
            }
        }
//        String newStr = "";
//        for (String word: arr){
//            newStr += word + " ";
//        }
        return String.join(" ", arr).replace(" ,", ",");
//        return newStr.replace(" ,", ",");


    }
}
