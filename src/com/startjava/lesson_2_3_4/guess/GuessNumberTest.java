package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Player[] players = createTeam();
        if (players == null) {
            return;
        }
        GuessNumber game = new GuessNumber(players);
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (true) {
            if (!answer.equals("yes")) {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                answer = scanner.nextLine();
                if (answer.equals("no")) {
                    return;
                } else {
                    continue;
                }
            }
            game.start();
            for (Player player : players) {
                player.show();
                player.startNewRound();
            }
            answer = "";
        }
    }

    public static Player[] createTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int countPlayers = scanner.nextInt();
        if (countPlayers <= 0) {
            System.out.println("Число игроков должно быть больше нуля");
            return null;
        }
        scanner.nextLine();
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < countPlayers; i++) {
            System.out.print("Введите имя игрока № " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }
        return players;
    }
}
