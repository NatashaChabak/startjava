package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {5, 1, 3, 2, 7, 6, 4};
        int len = intArr.length;
        int num;
        showArray(intArr);
        for (int i = 0; i < len / 2; i++) {
            num = intArr[i];
            intArr[i] = intArr[len - 1 - i];
            intArr[len - 1 - i] =  num;
        }
        System.out.println();
        showArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        int product = 1;
        StringBuilder dop = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
            if (i > 0 && i < 9) {
                product *= i;
                System.out.print(i + (i < 8 ? " * " : " = "));
            } else {
                dop.append(intArr[i]).append(" index ").append(i).append("; ");
            }
        }
        System.out.println(product);
        System.out.println(dop);

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        float[] floatArr = new float[len];
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        int border = len / 2;
        float fl = floatArr[border++];
        System.out.println("Исходный массив:");
        showArray(floatArr, border);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > fl) {
                floatArr[i] = 0;
                sum++;
            }
        }
        System.out.println("\nИзмененный массив:");
        showArray(floatArr, border);
        System.out.println("\nКоличество обнуленных ячеек = " + sum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        for (int i = 0; i < 26; i++) {
            charArr[i] = (char) (i + 65);
        }
        for (int i = 25; i >= 0; i--) {
            for (int j = 25; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        int myNum;
        for (int i = 0; i < 30; i++){
            do {
                myNum = (int) (60 + (Math.random() * 40));
            } while (contains(intArr, myNum));
            intArr[i] = myNum;
        }
        Arrays.sort(intArr);
        showArray(intArr);

        System.out.println("\n6. Копирование не пустых строк");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int initLen = strArr.length;
        len = initLen;
        for (String s: strArr) {
            if (s.isBlank()) {
                len--;
            }
        }
        String [] newArr = new String[len];
        len = 0;
        for (int i =0; i < initLen; i++) {
            int inputLen = 1;
            if (!strArr[i].isBlank()) {
                int indexFrom = i;
                while (i < (initLen - 1) && !strArr[i + 1].isBlank()) {
                    inputLen++;
                    i++;
                }
                System.arraycopy(strArr, indexFrom, newArr, len, inputLen);
                len += inputLen;
            }
        }
        System.out.println("Исходный массив:");
        showArray(strArr);
        System.out.println("\nМассив с непустыми строками:");
        showArray(newArr);
    }
    private static boolean contains(int[] intArr, int value) {
        for (int a: intArr) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }
    private static void showArray(int[] array) {
        int counter = 0;
        for (int a: array) {
            System.out.print(a + " ");
            counter++;
            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }
    private static void showArray(String[] array) {
        for (String s: array) {
            System.out.print(s + "; ");
        }
    }
    private static void showArray(float[] array, int border) {
        for (int i = 0; i < border; i++) {
            System.out.printf("%-10.3f", array[i]);
        }
        System.out.println();
        for (int i = border; i < array.length; i++) {
            System.out.printf("%-10.3f", array[i]);
        }
    }
}
