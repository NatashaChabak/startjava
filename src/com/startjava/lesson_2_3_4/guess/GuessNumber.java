package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static final int COUNT = 10;
    static int min;
    static int max;
    private final Player[] players;

    public GuessNumber(Player...players) {
        this.players = players;
    }

    public void start() {
        System.out.print("У каждого игрока по 10 попыток\n");
        Random random = new Random();
        min = 1;
        max = 100;
        int hiddenNum = random.nextInt(max) + min;
        shuffle();
        int countLosses = 0;
        while (true) {
            for (Player player : players) {
                int num = inputNum(player, min, max);
                int attempt = player.getAttempt();
                if (checkNum(num, hiddenNum, player.getName(), attempt)) {
                      return;
                } else if (attempt >= COUNT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    countLosses++;
                    if (countLosses == players.length) {
                        return;
                    }
                } else {
                    min = (num < hiddenNum ? num : min);
                    max = (num > hiddenNum ? num : max);
                }
            }
        }
    }

    public boolean checkNum(int num, int hiddenNum, String name, int attempt) {
        if (num == hiddenNum) {
            System.out.println("Игрок " + name + " угадал число " + hiddenNum
                    + " с " + attempt + " попытки");
            return true;
        } else {
            System.out.println("Число " + num + (num < hiddenNum ? " меньше" : " больше")
                    + " того, что загадал компьютер");
             return false;
        }
    }

    public void finish() {
        for (Player player : players) {
            int[] enteredNums = player.getEnteredNums();
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int enteredNum : enteredNums) {
                System.out.print(enteredNum + " ");
            }
            System.out.println();
            player.clear();
        }
    }

    private void shuffle() {
        int len = players.length;
        Player randomPlayer;
        Random random = new Random();
        for (int i = 0; i < players.length; i++) {
            int index = random.nextInt(len);
            randomPlayer = players[index];
            players[index] = players[len - 1];
            players[len-- - 1] = randomPlayer;
        }
     }

    private int inputNum(Player player, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите любое число от " + min + " до " + max + ": ");
        int num = scanner.nextInt();
        while (!player.addNum(num, min, max)) {
            System.out.print(player.getName() + ", введите любое число от " + min + " до " + max + ": ");
            num = scanner.nextInt();
        }
        return num;
    }
}

