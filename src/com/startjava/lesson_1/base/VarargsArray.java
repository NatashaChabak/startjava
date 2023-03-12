package com.startjava.lesson_1.base;

public class VarargsArray {
    public static void main(String[] args) {
        String [] [] arrays = new String[5][];
        int arrayLenght = 0;
        for (int i = 0; i < 5; i++) {
            arrays[i] = new String[]{"a", "b", "c"};
            arrayLenght += 3;
        }
        String [] result = abc(arrayLenght, arrays);
        for (int i = 0; i < result.length; i++) {
            for (String arg: args) {
                if (arg.equals(result[i])) {
                    result[i] = null;
                }
            }
        }
        System.out.println();
        for (String b: result) {
            System.out.print(b);
        }
    }

    static String [] abc(int arrayLenght, String []... arrays) {
        String [] newArray = new String[arrayLenght];
        int i = 0;
        for (String [] array: arrays) {
            for (String a: array) {
                System.out.print(a);
                newArray[i] = a;
                i++;
            }
        }
        return newArray;
    }
}
