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
            String calculateInput = scanner.nextLine();
            try {
                double result = Calculator.calculate(calculateInput);
                System.out.print(calculateInput + " = ");
                System.out.printf(result % 1 == 0 ? "%,.0f" : "%,.3f", result);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный ввод: " + e.getMessage());
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Некорректный ввод: " + e.getMessage());
                continue;
            }
            answer = "";
          }
    }
}
