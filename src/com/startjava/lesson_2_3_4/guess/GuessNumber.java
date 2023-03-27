package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static final int COUNT = 10;
    private final Player[] players;

    public GuessNumber(Player...players) {
        this.players = players;
    }

    public void start() {
        System.out.print("У каждого игрока по 10 попыток\n");
        Random random = new Random();
        int min = 1;
        int max = 100;
        int hiddenNum = random.nextInt(max) + min;
        shuffle();
        int countLosses = 0;
        while (true) {
            for (Player player : players) {
                int num = inputNum(player, min, max);
                if (num == hiddenNum) {
                    System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNum
                            + " с " + player.getCounter() + " попытки");
                    return;
                } else if (player.getCounter() >= COUNT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    countLosses++;
                    if (countLosses == players.length) {
                        return;
                    }
                } else {
                    System.out.println("Число " + num + (num < hiddenNum ? " меньше" : " больше")
                            + " того, что загадал компьютер");
                    min = (num < hiddenNum ? num : min);
                    max = (num > hiddenNum ? num : max);
                }
            }
        }
    }

    private void shuffle() {
        int len = players.length;
        Player randomPlayer;
        Random random = new Random();
        while (len > 0) {
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

