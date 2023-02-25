public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 25;
        if (age > 20){
            System.out.println("Older than 20");
        } else {
            System.out.println("Younger than 20");
        }
        boolean isMale = true;
        if (!isMale){
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
        float height = 1.75f;
        if (height < 1.80){
            System.out.println("Lower than 180 sm");
        } else {
            System.out.println("Higher than 180 sm");
        }
        char firstLetter = "Max".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Maxim");
        } else if (firstLetter == 'I') {
            System.out.println("Igor");
        }  else {
            System.out.println("Unknown");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 74;
        int number2 = 47;
        if (number1 == number2) {
            System.out.println("Number1 equals number2");
        } else if (number1 > number2) {
            System.out.println("max = " + number1 + "; min = " + number2);
        } else {
            System.out.println("max = " + number2 + "; min = " + number1);
        }

        System.out.println("\n3. Проверка числа");
        int randomNumber = 87;
        if (randomNumber == 0) {
            System.out.println("Number " + randomNumber + " equals to zero");
        } else {
            if (randomNumber < 0) {
                System.out.println("Number " + randomNumber + " is negative");
            } else {
                System.out.println("Number " + randomNumber + " is positive");
            }
            if (randomNumber % 2 == 0) {
                System.out.println("Number " + randomNumber + " is even");
            } else {
                System.out.println("Number " + randomNumber + " is odd");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 574;
        int num1_1 = num1 / 100;
        int num1_2 = num1 / 10 % 10;
        int num1_3 = num1 % 10;
        int num2_1 = num2 / 100;
        int num2_2 = num2 / 10 % 10;
        int num2_3 = num2 % 10;
        System.out.println("Number 1 = " + num1 + "; \nNumber 2 = " + num2 + ";");
        if (num2_1 != num1_1 & num2_2 != num1_2 & num2_3 != num1_3) {
            System.out.println("No identical digits!");
        } else {
            if (num1_1 == num2_1) {
                System.out.println("Identical digits in first digit: " + num1_1);
             }
            if (num1_2 == num2_2) {
                System.out.println("Identical digits in second digit: " + num1_2);
            }
            if (num1_3 == num2_3) {
                System.out.println("Identical digits in third digit: " + num1_3);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char initChar = '\u0057';
        if (initChar >= '0' & initChar <= '9') {
            System.out.println(initChar + " is a digit");
        } else if (initChar >= 'A' & initChar <= 'Z') {
                System.out.println(initChar + " is a capital letter");
        } else if (initChar >= 'a' & initChar <= 'z') {
                System.out.println(initChar + " is a small letter");
        } else {
            System.out.println(initChar + " is neither a letter nor a digit");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        float interestRate = deposit < 100_000 ? 0.05f : deposit <= 300_000 ? 0.07f : 0.1f;
        System.out.println("Amount on bank account: " + deposit);
        System.out.println("Profit amount: " + (deposit * interestRate));
        System.out.println("Total amount: " + (deposit + deposit * interestRate));

        System.out.println("\n7. Определение оценки по предметам");
        int percHistory = 59;
        int scoreHistory = percHistory > 91 ? 5 : percHistory > 73 ? 4 : percHistory > 60 ? 3 : 2;
        System.out.println("History score: " + scoreHistory);
        int percProgram = 91;
        int scoreProgram = percProgram > 91 ? 5 : percProgram > 73 ? 4 : percProgram > 60 ? 3 : 2;
        System.out.println("Programming score: " + scoreProgram);
        System.out.println("Average score: " + ((scoreProgram + scoreHistory)/2));
        System.out.println("Average %: " + ((percHistory + percProgram)/2));

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5_000;
        int cost = 9_000;
        int revenue = 13_000;
        int profit = (revenue - rent - cost) * 12;
        char sign = profit > 0 ? '+' : ' ';
        System.out.println("Annual profit:" + sign + profit);

        System.out.println("\n9. Подсчет количества банкнот");
        int amount = 567;
        System.out.println("Total amount " + amount);
        int banknote100 = 10;
        int banknote10 = 5;
        int banknote1 = 50;
        int totalAmount = banknote100 * 100 + banknote10 * 10 + banknote1;
        if (totalAmount < amount) {
            System.out.println("Not enough money!");
        } else {
            if (totalAmount > amount) {
                banknote100 = amount / 100 > banknote100 ? banknote100  : amount / 100;
                amount -= banknote100 * 100;
                banknote10 = (amount / 100 * 10 + amount / 10 % 10) > banknote10 ? banknote10  
                        : (amount / 100 * 10 + amount / 10 % 10);
                amount -= banknote10 * 10;
                banknote1 = amount > banknote1 ? banknote1  : amount;
            }
            System.out.println("Consist of " + banknote100 + " * 100 banknotes; " + banknote10 + 
                    " * 10 banknotes; " + banknote1 + " * 1 banknotes; ");
        }
    }
}