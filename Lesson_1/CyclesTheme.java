public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter < 22);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println('\n' + "Сумма его цифр " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int endRange = 24;
        for (int i = 1; i < endRange; i += 10) {
            for (int j = 0; j < 10; j += 2) {
                num = (i + j >= endRange) ? 0 : i + j;
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        System.out.print("Число " + num + " содержит ");
        int countTwos = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                countTwos++;
            }
            num /= 10;
        }
        String oddOrEven = (countTwos % 2 == 0) ? "четное" : "нечетное";
        System.out.println(countTwos + " (" + oddOrEven + ") количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println("**********\n");
            } else {
                System.out.println("**********");
            }
        }

        int inRow = 5;
        int signs;
        while (inRow > 0) {
            signs = 0;
            while (signs < inRow) {
                System.out.print('#');
                signs++;
            }
            System.out.println();
            inRow--;
        }
        System.out.println();

        int row  = 1;
        do {
            inRow = row > 3 ? (6 - row) : row;
            counter = 1;
            do {
                System.out.print("$");
                counter++;
            } while (counter <= inRow);
            System.out.println();
            row++;
        } while (row < 6);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%8s%n", "Dec Char");
        for (int i = 0; i < 128; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("%3d %3s%n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int n = num;
        int reversedNum = 0;
        while (n > 0) {
            reversedNum = reversedNum * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Число " + reversedNum + (reversedNum == num ? "" : " не") + " является палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 215521;
        int firstPart = num / 1000;
        int secondPart = num % 1000;
        int sum1 = 0;
        int sum2 = 0;
        counter = 0;
        String initResult = "Число " + num;
        while (num > 0) {
            digit = num % 10;
            if (counter > 2) {
                sum2 += digit;
            } else {
                sum1 += digit;
            }
            num /= 10;
            counter++;
        }
        System.out.println("Сумма цифр " + firstPart + " = " + sum2);
        System.out.println("Сумма цифр " + secondPart + " = " + sum1);
        initResult += sum2 == sum1 ? "" : " не";
        System.out.println(initResult + " является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 9; i++) {
           if (i == 0) {
                System.out.printf("%4s", "|");
            } else {
                System.out.printf("%3d", (i + 1));
            }
        }
        System.out.println();
        for (int k = 0; k < 28; k++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%3s", "");
                } else {
                    System.out.printf("%3d", (i + 1) * (j + 1));
                }
                if (j == 0) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}