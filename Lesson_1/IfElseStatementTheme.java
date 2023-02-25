public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 25;
        if (age > 20) {
            System.out.println("Older than 20");
        } else {
            System.out.println("Younger than 20");
        }
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
        float height = 1.75f;
        if (height < 1.80) {
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
        int numb1 = 74;
        int numb2 = 47;
        if (numb1 == numb2) {
            System.out.println("Number1 equals number2");
        } else if (numb1 > numb2) {
            System.out.println("max = " + numb1 + "; min = " + numb2);
        } else {
            System.out.println("max = " + numb2 + "; min = " + numb2);
        }

        System.out.println("\n3. Проверка числа");
        int randomNumber = 87;
        if (randomNumber == 0) {
            System.out.println("Number " + randomNumber + " equals to zero");
        } else {
            String result;
            if (randomNumber < 0) {
                result = "negative";
            } else {
                result = "positive";
            }
            if (randomNumber % 2 == 0) {
                result = "even";
            } else {
                result = "odd";
            }
            System.out.println("Number " + randomNumber + " is " + result);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 423;
        int num2 = 573;
        int hundreds1 = num1 / 100;
        int tens1 = num1 / 10 % 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = num2 / 10 % 10;
        int ones2 = num2 % 10;
        System.out.println("Number 1 = " + num1 + "; \nNumber 2 = " + num2 + ";");
        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("No identical digits!");
        } else {
            if (hundreds1 == hundreds2) {
                System.out.println("Identical digits in hundreds: " + hundreds1);
             }
            if (tens1 == tens2) {
                System.out.println("Identical digits in tens: " + tens1);
            }
            if (ones1 == ones2) {
                System.out.println("Identical digits in ones: " + ones1);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char unknownChar = '\u0057';
        if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println(unknownChar + " is a digit");
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println(unknownChar + " is a capital letter");
        } else if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println(unknownChar + " is a small letter");
        } else {
            System.out.println(unknownChar + " is neither a letter nor a digit");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        float interestRate = 0.05f;
        if (deposit >= 100_000) {
            interestRate = (deposit > 300_000) ? 0.1f : 0.07f;
        }
        System.out.println("Amount on bank account: " + deposit);
        System.out.println("Profit amount: " + (deposit * interestRate));
        System.out.println("Total amount: " + (deposit + deposit * interestRate));

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int scoreHistory = 2;
        if (percentHistory  > 73) {
            scoreHistory = percentHistory > 91 ? 5 : 4;
        } else if (percentHistory  > 60) {
            scoreHistory = 3;
        }
        System.out.println("History score: " + scoreHistory);
        int percentProgramming = 91;
        int scoreProgramming = 2;
        if (percentProgramming  > 73) {
            scoreProgramming = percentProgramming > 91 ? 5 : 4;
        } else if (percentHistory  > 60) {
            scoreProgramming = 3;
        }
        System.out.println("Programming score: " + scoreProgramming);
        System.out.println("Average score: " + ((scoreProgramming + scoreHistory) / 2));
        System.out.println("Average %: " + ((percentHistory + percentProgramming) / 2));

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