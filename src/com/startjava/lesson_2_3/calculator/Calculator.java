package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public void calculate(int a, int b, char sign) {
        float result = 0f;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (float) a / (float) b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Cannot recognize sign " + sign);
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}