package com.java.marathon.sprint16_exersices.codingBat;

import java.util.*;

public class App {

//    static class Mapper {
//        public static<T> T map(T t) {
//            return t;
//        }
//    }

    public static void main(String[] args) {

//        int a[] = {};
//        int b[] = {};
//        System.out.println(front11(a, b));
//        System.out.println(wordEnds("abcXY123XYijk", "XY"));
//        int mult = 10;
//        int finalMult = mult;
//        class Local{
//            int multi(int number){
//                return number * finalMult;
//            }
//        }
//        mult = 5;

//        System.out.println(plusOut("12xy34", "xy"));
//        String[] arr = {"t","e","s","t", "t", "e"};
//        System.out.println(ununigueElements(arr));
//        Set<String> set = Stream.of(arr).filter(s -> Collections.frequency(Arrays.asList(arr), s) > 1).collect(Collectors.toSet());
//        System.out.println(set);
//        Integer[] arr = {2, 4, 5, 6, 24, 5, 6, 8, 2};
//        System.out.println(Arrays.toString(ununigueElements1(arr)));
//        int[] arr = {2, 1, 2, 3, 4};
//        System.out.println(countEvens(arr));
//        System.out.println(fizzArray3(5, 10));
        System.out.println(sumNumbers("abc123xyz"));
    }

    public static String front11(int[] a, int[] b) {
        int arr[] = new int[0];
        if (a.length > 0 && b.length > 0) {
            arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];
        }
        if (a.length == 0 && b.length == 0) {
            arr = new int[0];
        }
        if (a.length > 0 && b.length == 0) {
            arr = new int[1];
            arr[0] = a[0];
        }
        if (a.length == 0 && b.length > 0) {
            arr = new int[1];
            arr[0] = b[0];
        }
        return Arrays.toString(arr);
    }

    public static int factorial(int n) {
        int result = 1;
        if (n > 1) {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static String wordEnds(String str, String word) {
        String newStr = "";
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i).startsWith(word)) {
                if (i != 0) {
                    newStr += String.valueOf(str.charAt(i - 1));
                }
                if (i != (str.length() - word.length())) {
                    newStr += String.valueOf(str.charAt(i + word.length()));
                }
            }
        }
        return newStr;
    }

    //    public static String plusOut(String str, String word) {
//     //   String newStr = "";
//        for(int i = 0; i<=str.length()-word.length(); i++){
//            if(str.substring(i, i + word.length()).equals(word)){
//                i += word.length()
//            }
//
//            if(!str.substring(i, i + word.length()).equals(word)){
//                str = str.replace(str.charAt(i), '+');
//            }
//        }
//        return str;
//    }
    public static <T> Set<T>/*T[]*/ ununigueElements(T[] arr) {
        Set<T> list = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                }
            }
        }
//        return (T[]) list.toArray();
        return list;
    }

    public static <T> /*Set<T>*/T[] ununigueElements1(T[] arr) {
        Set<T> set = new HashSet<>();
        Set<T> set1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                set1.add(arr[i]);
            }
        }
        return (T[]) set1.toArray();
//        return set1;
    }

    public static List<Integer> uniqueNumbers(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean dup = false;
            for (int j = 0; j < list.size(); j++) {
                if (a[i] == list.get(j)) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                list.add(a[i]);
            }
        }
        return list;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    //    Given an array of ints, return true if the array contains two 7's next
//    to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
    public static boolean has77(int[] nums) {
        boolean isHas77 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                isHas77 = true;
            }
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 2] == 7) {
                isHas77 = true;
            }
        }
        return isHas77;
    }

    // Given start and end numbers, return a new array containing the sequence of integers from start up
// to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater
// or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
    public static int[] fizzArray3(int start, int end) {
        int[] newArr = new int[end - start];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = start;
            start++;
        }
        return newArr;
    }

    // Return a version of the given array where each zero value in the array is replaced by the largest
// odd value to the right of the zero in the array. If there is no odd value to the right of the zero,
// leave the zero as a zero.
    public static int[] zeroMax(int[] nums) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int bigestNum = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > bigestNum) {
                        bigestNum = nums[j];
                    }
                }
                nums[i] = bigestNum;
            }
        }
        return nums;
    }

    public static int countTriple(String str) {
        int count = 0;
        if (str.length() >= 3) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumNumbers(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                newStr += str.charAt(i);
            }
        }
        if (!newStr.isEmpty()) {
            return Integer.parseInt(newStr);
        } else {
            return 0;
        }

    }

    public static void fuss() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println("fuss");
            }else if (numbers[i] % 5 == 0) {
                System.out.println("buss");
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}

