package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        if (partsExpression.length != 3) {
            System.out.println("Введите значения, разделенные пробелом");
            return 0;
        }
        int a = Integer.parseInt(partsExpression[0]);
        String sign = partsExpression[1];
        int b = Integer.parseInt(partsExpression[2]);
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Введите положительные числа!");
        }
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> Math.multiplyExact(a, b);
            case "/" -> (double) a / (double) b;
            case "^" -> Math.pow(a, b);
            default -> throw new IllegalArgumentException("Некорректный знак операции!");
        };
    }
}