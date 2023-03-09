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
            Calculator.calculate(a, b, sign);
            System.out.print("Хотите продолжить вычисления? [yes/no] ");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}
