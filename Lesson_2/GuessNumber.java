import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int hiddenNum = random.nextInt(max) + min;
        String name1 = player1.getName();
        String name2 = player2.getName();
        String name;
        int num;
        int counter = 0;
        do {
            name = counter % 2 == 0 ? name1 : name2;
            System.out.print(name + ", введите любое число от " + min + " до " + max + ": ");
            num = scanner.nextInt();
            if (num < hiddenNum) {
                System.out.println("Число " + num + " меньше того, что загадал компьютер");
                min = num;
            } else if (num > hiddenNum) {
                System.out.println("Число " + num + " больше того, что загадал компьютер");
                max = num;
            }
            counter++;
        } while (hiddenNum != num);
        System.out.println(name + ", Вы угадали! Число = " + hiddenNum);
    }
}
