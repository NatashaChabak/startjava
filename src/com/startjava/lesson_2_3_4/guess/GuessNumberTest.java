package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Player[] players = createPlayers();
        GuessNumber game = new GuessNumber(players);
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
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
            System.out.print("Хотите продолжить игру? [yes/no] ");
            answer = scanner.nextLine();
         } while (!answer.equals("no"));
    }

    public static Player[] createPlayers() {
        Scanner scanner = new Scanner(System.in);
        int countPlayers;
        do {
            System.out.print("Введите количество игроков: ");
            countPlayers = scanner.nextInt();
        } while (countPlayers <= 0);
        scanner.nextLine();
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < countPlayers; i++) {
            System.out.print("Введите имя игрока № " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}
