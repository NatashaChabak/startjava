package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {5, 1, 3, 2, 7, 6, 4};
        int len = intArr.length;
        int half = len / 2;
        show(intArr);
        for (int i = 0; i < half; i++) {
            len--;
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] =  temp;
        }
        System.out.println();
        show(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        int product = 1;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
            if (i > 0 && i < (len - 1)) {
                product *= i;
                System.out.print(i + (i < (len - 2) ? " * " : " = "));
            }
        }
        System.out.println(product);
        System.out.println(intArr[0] + " index 0; " + intArr[len - 1] + " index 9;");

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        float[] floatArr = new float[len];
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        int border = len / 2;
        float middleCellValue = floatArr[border++];
        System.out.println("Исходный массив:");
        show(floatArr, border);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleCellValue) {
                floatArr[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив:");
        show(floatArr, border);
        System.out.println("\nКоличество обнуленных ячеек = " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) (i + 'A');
        }
        len--;
        for (int i = len; i >= 0; i--) {
            for (int j = len; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum  = (int) (60 + (Math.random() * 40));
            } while (contains(intArr, randomNum));
            intArr[i] = randomNum;
        }
        Arrays.sort(intArr);
        show(intArr);

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcStrings.length;
        int countNonBlankStrings = len;
        for (String s : srcStrings) {
            if (s.isBlank()) {
                countNonBlankStrings--;
            }
        }
        String[] destStrings = new String[countNonBlankStrings];
        int inputLen = 0;
        int size = 0;
        for (int i = 0; i < len; i++) {
            if (!srcStrings[i].isBlank()) {
                inputLen++;
            } else if (inputLen > 0) {
                System.arraycopy(srcStrings, (i -  inputLen), destStrings, size, inputLen);
                size += inputLen;
                inputLen = 0;
            }
        }
        System.out.println("Исходный массив:");
        show(srcStrings);
        System.out.println("\nМассив с непустыми строками:");
        show(destStrings);
    }
    private static boolean contains(int[] intArr, int value) {
        for (int a: intArr) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }

    private static void show(int[] arr) {
        int counter = 0;
        for (int a : arr) {
            System.out.print(a + " ");
            counter++;
            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void show(String[] arr) {
        for (String s : arr) {
            System.out.print(s + "; ");
        }
    }

    private static void show(float[] arr, int border) {
        for (int i = 0; i < border; i++) {
            System.out.printf("%-8.3f", arr[i]);
        }
        System.out.println();
        for (int i = border; i < arr.length; i++) {
            System.out.printf("%-8.3f", arr[i]);
        }
    }
}
