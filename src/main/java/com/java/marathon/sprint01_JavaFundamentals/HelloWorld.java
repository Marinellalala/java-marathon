package com.java.marathon.sprint01_JavaFundamentals;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Q1
    }

    // Q2
    public static float doubleNumber(double number) {
        float a = (float) number;
        return 2 * a;
    }

    // Q3
    public static int century(int year) {
        int century;
        if (year % 100 == 0) {
            century = (year / 100);
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }

    // Q4
    public static int sumOfDigits(int number) {
        return (number % 10) + (number / 10) % 10 + (number / 100);
    }

    // Q5
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (!(year % 100 == 0)) {
                isLeapYear = true;
            }
        }
        if (year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    private static void bubbleSorter(int[] data) {
        // Сортировка пузырьков
        for(int barrier = data.length-1; barrier>=0;barrier--){
            for (int i=0; i<barrier; i++){
                if (data[i] > data[i+1]) {
                    int temp= data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;

                }
            }
        }
    }

    private static void reversArr(int[] a) {
        for (int i=0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length -i-1] = temp;
        }
    }

    private static void task1(String[] args) {
        // Task 1.1. Приветствовать любого пользователя при вводе его имени через командную строку.
        String name = "";
        for (int i = 0; i < args.length; i++) {
            name += args[i];
        }
        System.out.println("Hi " + name);
    }

    private static void task2(String[] args) {
        // Task 1.2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]);
        }
    }

    private static void task3(String[] args) {
        // Task 1.3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        for (int i = 0; i < args.length; i++) {
            System.out.println(Math.round(Math.random() * 10));
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(Math.round(Math.random() * 10));
        }
    }

    private static void task4(String[] args) {
        // Task 1.4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        String truePassword = "summer123";
        String password = "";
        for (int i = 0; i < args.length; i++) {
            password += args[i];
        }
        if (password.equals(truePassword)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Wrong password");
        }
    }

    private static void task5(String[] args) {
        // Task 1.5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.valueOf(args[i]);
            multiple = multiple * Integer.valueOf(args[i]);
        }
        System.out.println(sum);
        System.out.println(multiple);
    }

    private static void task6(String[] args) {
      /*Task 1.6.Ввести с консоли n целых чисел. На консоль вывести:
      6.1. Четные и нечетные числа.
      6.2. Наибольшее и наименьшее число.
      6.3. Числа, которые делятся на 3 или на 9.
      6.4. Числа, которые делятся на 5 и на 7.
      6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
      цифр.
      6.6. «Счастливые» числа.
      6.7. Элементы, которые равны полусумме соседних элементов.*/
        String evenNumbers = "";
        String oddNumbers = "";
        int maxValue = Integer.valueOf(args[0]);
        int minValue = Integer.valueOf(args[0]);
        int semiSum;
        String devided3or9 = "";
        String devided5and7 = "";
        String happyNumber = "";
        String separator = ", ";
        String number = "";
        for (int i = 0; i < args.length; i++) {
            if (Integer.valueOf(args[i]) % 2 == 0) {
                evenNumbers += args[i] + separator;
            } else if (Integer.valueOf(args[i]) % 2 != 0) {
                oddNumbers += args[i] + separator;
            }
            if (Integer.valueOf(args[i]) > maxValue) {
                maxValue = Integer.valueOf(args[i]);
            }
            if (Integer.valueOf(args[i]) < minValue) {
                minValue = Integer.valueOf(args[i]);
            }
            if ((Integer.valueOf(args[i]) % 3 == 0) || (Integer.valueOf(args[i]) % 9 == 0)) {
                devided3or9 += args[i] + separator;
            }
            if ((Integer.valueOf(args[i]) % 5 == 0) && (Integer.valueOf(args[i]) % 7 == 0)) {
                devided5and7 += args[i] + separator;
            }
            if (Integer.valueOf(args[i]) == 65) {
                happyNumber += args[i] + separator;
            }
            if ((Integer.valueOf(args[i]) >= 100) && ((Integer.valueOf(args[i])) <= 999)) {
                String number1 = args[i];
                if ((number1.charAt(0) != number1.charAt(1)) && (number1.charAt(0) != number1.charAt(2)) && (number1.charAt(1) != number1.charAt(2))) {
                    number += number1 + separator;
                }
            }

        }
        for (int j = 1; j < args.length - 1; j++) {
            semiSum = (Integer.valueOf(args[j - 1]) + Integer.valueOf(args[j + 1])) / 2;
            if (Integer.valueOf(args[j]) == semiSum) {
                System.out.println("Этo элементы, которые равны полусумме соседних элементов: " + semiSum);
            }
        }
        System.out.println("Это четные числа: " + evenNumbers);
        System.out.println("Это нечетные числа: " + oddNumbers);
        System.out.println("Это наибольшее число: " + maxValue);
        System.out.println("Это наименьшее число: " + minValue);
        System.out.println("Эти числа делятся на 3 или 9: " + devided3or9);
        System.out.println("Эти числа делятся на 5 и на 7: " + devided5and7);
        System.out.println("Этo 'Счастливые' числа: " + happyNumber);
        System.out.println("Этo трехзначные числа без одинаковых цифр: " + number);
    }
}

