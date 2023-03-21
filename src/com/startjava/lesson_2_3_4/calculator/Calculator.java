package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String input) {
        String[] inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        String sign = inputArr[1];
        int b = Integer.parseInt(inputArr[2]);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        double result = switch (sign) {
            case "+" -> (a + b);
            case "-" -> (a - b);
            case "*" -> (Math.multiplyExact(a, b));
            case "/" -> ((double) a / (double) b);
            case "^" -> (Math.pow(a, b));
            default ->  throw new IllegalArgumentException();
        };
        System.out.print(a + " " + sign + " " + b + " = ");
        return result;
    }
}