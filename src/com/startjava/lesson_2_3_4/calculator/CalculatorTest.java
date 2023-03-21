package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (true) {
            if (!answer.equals("yes")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = scanner.nextLine();
                if (answer.equals("no")) {
                    return;
                } else {
                    continue;
                }
            }
            System.out.print("Введите математическое выражение: ");
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            int a = Integer.parseInt(inputArr[0]);
            String sign = inputArr[1];
            int b = Integer.parseInt(inputArr[2]);
            double result = Calculator.calculate(a, b, sign);
            System.out.println(a + " " + sign + " " + b + " = " + (result % 1 == 0 ? String.format("%,.0f", result) : String.format("%,.3f", result) ));
            answer = "";
          }
    }
}
