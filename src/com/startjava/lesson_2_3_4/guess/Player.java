package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int attempt;
    private final int[] enteredNums = new int[10];

    public Player(String name) {
        this.name =  name;
    }
    
    public String getName() {
        return name;
    }

    public int getCounter() {
       return attempt;
    }

    public boolean setNum(int num, int min, int max) {
        if (num < min || num > max) {
            System.out.println("Введенное число вне интервала от " + min + " до " + max);
            return false;
        }
        enteredNums[attempt] = num;
        attempt++;
        return true;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempt);
    }

    public void clear() {
        Arrays.fill(enteredNums, 0, attempt, 0);
        attempt = 0;
    }
}
