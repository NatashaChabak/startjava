public class MyFirstGame {

    public static void main(String[] args) {
        int num = 5;
        int min = 1;
        int max = 100;
        if (num < min || num > max) {
            System.out.println("Выбранное число не попадает в интервал!");
            return;
        }
        int s = 1;
        int randomNumber = createNumber(min, max, s);
        while (randomNumber != num) {
            if (randomNumber < num) {
                System.out.println("Число " + randomNumber + " меньше того, что загадал компьютер");
                min = randomNumber;
            } else if (randomNumber > num) {
                System.out.println("Число " + randomNumber + " больше того, что загадал компьютер");
                max = randomNumber;
            }
            s++;
            randomNumber = createNumber(min, max, s);
        }
        System.out.println("Вы угадали! Число = " + num);

    }

    static int createNumber(int min, int max, int s) {
        if (min == max) {
            return min;
        } else if ((max - min) == 1) {
            return s % 2 == 0 ? min : max;
        } else if ((max - min) == 2) {
            return min + 1;
        }
        int num = min + (max - min) / 3;
        num = num > max ? max : num;
        num = num < min ? min : num;
        return num;
    }
}