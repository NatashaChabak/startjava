package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int counter;
    private final int[] numArr = new int[10];

    public Player(String name) {
        this.name =  name;
    }
    
    public String getName() {
        return name;
    }

    public int getCounter() {
       return counter;
    }
    public boolean setNum(int num, int min, int max) {
        if (num < min || num > max) {
            System.out.println("Введенное число вне интервала от " + min + " до " + max);
            return false;
        }
        numArr[counter] = num;
        counter++;
        return true;
    }

    public void show() {
        System.out.print("Числа игрока " + name + ": ");
        for (int i = 0; i < counter; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }

    public void startNewRound() {
        Arrays.fill(numArr, 0, counter, 0);
        counter = 0;
    }
}
