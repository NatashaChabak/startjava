package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (true) {
            if (!answer.equals("yes")) {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                answer = scanner.nextLine();
                if (answer.equals("no")) {
                    return;
                } else {
                    continue;
                }
            }
            System.out.print("Введите математическое выражение: ");
            String input = scanner.nextLine();
            try {
                double result = Calculator.calculate(input);
                System.out.print(result % 1 == 0 ? String.format("%,.0f", result) : String.format("%,.3f", result));
            } catch (IllegalArgumentException e) {
                System.out.println("Cannot recognize sign");
            }
            answer = "";
          }
    }
}
