package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static final int COUNT = 10;
    private Player[] playerArr;

    public GuessNumber(Player...players) {
        this.playerArr = Arrays.copyOf(players, players.length);
    }

    public void shuffle() {
        int len = playerArr.length;
        Player[] newArr = new Player[len];
        Random random = new Random();
        int ranNum;
        while (len > 0) {
            ranNum = random.nextInt(len);
            newArr[len - 1] = playerArr[ranNum];
            playerArr[ranNum] = playerArr[len - 1];
            len--;
        }
        playerArr = newArr;
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
            for (Player player : playerArr) {
                int num = getNum(player, min, max);
                if (num == hiddenNum) {
                    System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNum + " с " + player.getCounter() + " попытки");
                    return;
                } else if (player.getCounter() >= COUNT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    countLosses++;
                    if (countLosses == playerArr.length) {
                        return;
                    }
                } else if (num < hiddenNum) {
                    System.out.println("Число " + num + " меньше того, что загадал компьютер");
                    min = num;
                } else  {
                    System.out.println("Число " + num + " больше того, что загадал компьютер");
                    max = num;
                 }
            }
        }
    }

    private int getNum(Player player, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(player.getName() + ", введите любое число от " + min + " до " + max + ": ");
            int num = scanner.nextInt();
            if (player.setNum(num, min, max)) {
                return num;
            }
        }
    }
}
