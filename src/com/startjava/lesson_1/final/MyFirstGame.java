package com.startjava.lesson_1.final_task;

import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNum = 55;
        int min = 1;
        int max = 100;
        if (hiddenNum < min || hiddenNum > max) {
            System.out.println("Выбранное число не попадает в интервал!");
            return;
        }
        Random random = new Random();
        int myNum;
        do {
            myNum = random.nextInt(max - min + 1) + min;
            if (myNum < hiddenNum) {
                System.out.println("Число " + myNum + " меньше того, что загадал компьютер");
                min = myNum;
            } else if (myNum > hiddenNum) {
                System.out.println("number " + myNum + " больше того, что загадал компьютер");
                max = myNum;
            }
        } while (hiddenNum != myNum);
        System.out.println("Вы угадали! Число = " + hiddenNum);
    }
}