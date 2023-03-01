public class MyFirstGame {

    public static void main(String[] args) {
        int num = 5;
        int min = 1;
        int max = 100;
        if (num < min || num > max) {
            System.out.println("Выбранное число не попадает в интервал!");
            return;
        }
        int counter = 1;
        int targetNum = createNumber(min, max, counter);
        while (targetNum != num) {
            if (targetNum < num) {
                System.out.println("Число " + targetNum + " меньше того, что загадал компьютер");
                min = targetNum;
            } else if (targetNum > num) {
                System.out.println("number " + targetNum + " больше того, что загадал компьютер");
                max = targetNum;
            }
            counter++;
            targetNum = createNumber(min, max, counter);
        }
        System.out.println("Вы угадали! Число = " + num);

    }

    static int createNumber(int min, int max, int counter) {
        if (min == max) {
            return min;
        } else if ((max - min) == 1) {
            return counter % 2 == 0 ? min : max;
        } else if ((max - min) == 2) {
            return min + 1;
        }
        int num = min + (max - min) / 3;
        num = num > max ? max : num;
        num = num < min ? min : num;
        return num;
    }
}