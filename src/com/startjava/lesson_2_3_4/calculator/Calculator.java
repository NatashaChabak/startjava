package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String calculateInput) {
        String[] calculateParams = calculateInput.split(" ");
        if (calculateParams.length != 3) {
            throw new ArrayIndexOutOfBoundsException("Введите значения, разделенные пробелом");
        }
        int a = Integer.parseInt(calculateParams[0]);
        String sign = calculateParams[1];
        int b = Integer.parseInt(calculateParams[2]);
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Введите положительные числа!");
        }
        double result = switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> Math.multiplyExact(a, b);
            case "/" -> (double) a / (double) b;
            case "^" -> Math.pow(a, b);
            default ->  throw new IllegalArgumentException("Некорректный знак операции!");
        };
        return result;
    }
}