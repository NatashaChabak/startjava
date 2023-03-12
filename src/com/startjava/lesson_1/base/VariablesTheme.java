package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte processorNumber = 1;
        short memoryLimit = 6242;
        int memorySize = 16127;
        System.out.println("Число процессоров " + processorNumber + 
                "\nДоступная физическая память, МБ " + memoryLimit + 
                "\nПолный объем физической памяти, МБ " + memorySize);
        long virtualMemory = 21_036l;
        float procMemoryUsage = 85.814f;
        double procFreeMemory = 14.185_206_312_987_259d;
        System.out.println("Виртуальная память: Макс. размер,МБ " + virtualMemory + 
                "\nВиртуальная память: Используется, % " + procMemoryUsage + 
                "\nВиртуальная память: Доступнo, % " + procFreeMemory);
        char domainName = 'A';
        boolean availableHyperV = true;
        System.out.println("Домен " + domainName + 
                "\nРасширения режима мониторинга виртуальной машины " + availableHyperV);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount  = 11;
        int sumGoods = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки, руб. " + sumGoods);
        int discountAmount = sumGoods * discount / 100;
        System.out.println("Сумма скидки, руб. " + discountAmount);
        int discountPrice = sumGoods - discountAmount;
        System.out.println("Общая стоимость товаров со скидкой, руб. " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax  = 32_767;
        int intMax = 2_147_483_647;
        long longMax = Long.MAX_VALUE;
        System.out.println("byte. Первоначальное значение " + byteMax + 
                "; значение после инкремента " + (++byteMax) + 
                "; значение после декремента " + (--byteMax));
        System.out.println("short. Первоначальное значение " + shortMax + 
                "; значение после инкремента " + (++shortMax) + 
                "; значение после декремента " + (--shortMax));
        System.out.println("int. Первоначальное значение " + intMax + 
                "; значение после инкремента " + (++intMax) + 
                "; значение после декремента " + (--intMax));
        System.out.println("long. Первоначальное значение " + longMax + 
                "; значение после инкремента " + (++longMax) + 
                "; значение после декремента " + (--longMax));

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью третьей переменной.");
        System.out.println("Исходные значения: a =  " + a + "; b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);
        System.out.println("Перестановка с помощью арифметических операций.");
        System.out.println("Исходные значения: a =  " + a + "; b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);
        System.out.println("Перестановка с помощью побитовой операции.");
        System.out.println("Исходные значения: a =  " + a + "; b = " + b);
        a ^= b; 
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        System.out.println(hash + " " + (int) hash);
        char ampersand = '&';
        System.out.println(ampersand + " " + (int) ampersand);
        char atSign = '@';
        System.out.println(atSign + " " + (int) atSign);
        char caret  = '^';
        System.out.println(caret + " " + (int) caret);
        char underscoreSymbole = '_';
        System.out.println(underscoreSymbole + " " + (int) underscoreSymbole);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftBracket + " " + rightBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);
  
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int initNumber = 123;
        int hundreds = initNumber / 100;
        int tens = initNumber / 10 % 10;
        int ones = initNumber % 10;
        System.out.println("Число " + initNumber + " содержит:\n" + hundreds + 
                " сотен\n" + tens + " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр =  " + (hundreds + tens + ones));
        System.out.println("Произведение  =  " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        seconds %= 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}