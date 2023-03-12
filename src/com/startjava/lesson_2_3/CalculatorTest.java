package com.startjava.lesson_2_3;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            Calculator calculator = new Calculator();
            calculator.calculate(a, b, sign);
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (!answer.equals("no"));
    }
}
