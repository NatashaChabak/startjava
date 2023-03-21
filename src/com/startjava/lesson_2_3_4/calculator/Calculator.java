package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(int a, int b, String sign) {
        double result = 0d;
        switch (sign) {
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            case "*":
                return Math.multiplyExact(a, b);
            case "/":
                return (double) a / (double) b;
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("Cannot recognize sign " + sign);
                return result;
        }
    }
}