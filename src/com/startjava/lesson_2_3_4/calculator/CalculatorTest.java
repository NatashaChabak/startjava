package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                try {
                    double result = Calculator.calculate(mathExpression);
                    System.out.printf(mathExpression + " = " + (result % 1 == 0 ? "%,.0f" : "%,.3f"), result);
                } catch (RuntimeException e) {
                    System.out.println("Некорректный ввод: " + e.getMessage());
                    continue;
                }
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no] ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}
