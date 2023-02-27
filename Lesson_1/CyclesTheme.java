public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int num =  -10;
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            };
            num++;
        } while (num < 22);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNumber = num1 > num2 ? num1 : num2;
        maxNumber = maxNumber > num3 ? maxNumber : num3;
        int minNumber = num1 > num2 ? num2 : num1;
        minNumber = minNumber > num3 ? num3 : minNumber;
        for (int i = --maxNumber; i > minNumber; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int sum = 0;
        while (num > 0) {
            System.out.print(num % 10);
            sum += num % 10;
            num = (num - num % 10) / 10;
        }
        System.out.println('\n' + "Сумма его цифр " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int border = 24;
        int numSout;
        for (int i = 1; i < border; i = i + 10) {
            for (int n = 0; n < 10; n = n + 2) {
                numSout = (i + n >= border) ? 0 : i + n;
                System.out.printf("%3d", numSout);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        System.out.print("Число " + num + " содержит ");
        sum = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                sum++;
            }
            num = (num - num % 10) / 10;
        }
        String oddOrEven = (sum % 2 == 0) ? "четное" : "нечетное";
        System.out.println(sum + " (" + oddOrEven + ") количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 6; i++) {
            System.out.println("**********");
        }

        num = 5;
        char c = '#';
        int i;
        while (num > 0) {
            for (i = 1; i <= num; i++) {
                System.out.print(c);
            }
            System.out.println();
            num -= 1;
        }

        num  = 1;
        int numCycles;
        do {
            numCycles = num > 3 ? (6 - num) : num;
            for (i = 1; i <= numCycles; i++) {
                System.out.print("$");
            }
            System.out.println();
            num++;
        } while (num < 6);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%8s%n", "Dec Char");
        char exampleChar;
        for (i = 0; i < 128; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                exampleChar = (char) i;
                System.out.printf("%3d", i);
                System.out.printf("%4s%n", exampleChar);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int initNum = 1234321;
        int lenght = 1;
        while (initNum / lenght > 1) {
            lenght *= 10;
        }
        num = initNum;
        int reversedNum = 0;
        while (num > 0) {
            reversedNum += lenght * (num % 10);
            num = (num - num % 10) / 10;
            lenght /= 10;
        }
        String result = reversedNum == initNum ? "" : " не";
        System.out.println("Число " + initNum + result + " является палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 224521;
        int sum1 = 0;
        int sum2 = 0;
        int counter = 0;
        String abc1 = "";
        String abc2 = "";
        String initResult = "Число " + initNum;
        while (num > 0) {
            if (counter > 2) {
                sum2 += num % 10;
                abc2 = num % 10 + abc2;
            } else {
                sum1 += num % 10;
                abc1 = num % 10 + abc1;
            }
            num = (num - num % 10) / 10;
            counter++;
        }
        result = sum2 == sum1 ? "" : " не";
        System.out.println("Сумма цифр " + abc2 + " = " + sum2);
        System.out.println("Сумма цифр " + abc1 + " = " + sum1);
        System.out.println(initResult + result + " является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int x = 0; x < 9; x++) {
            for (int j = 0; j < 9; j++) {
                if (x == 0 && j == 0) {
                    System.out.printf("%3s", "");
                } else {
                    System.out.printf("%3d", (x + 1) * (j + 1));
                }
                if (j == 0) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (x == 0) {
                for (int n = 0; n < 28; n++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}