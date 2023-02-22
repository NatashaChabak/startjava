public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Вывод значений переменных на консоль");
        byte processorNumber = 1;
        short memoryLimit = 6242;
        int memorySize = 16127;
        System.out.println("Число процессоров " + processorNumber + "\nДоступная физическая память, МБ " + memoryLimit + "\nПолный объем физической памяти, МБ " + memorySize);
        long virtualMemory = 21_036l;
        float procMemoryUsage = 85.814f;
        double procFreeMemory = 14.185_206_312_987_259d;
        System.out.println("Виртуальная память: Макс. размер,МБ " + virtualMemory + "\nВиртуальная память: Используется, % " + procMemoryUsage + "\nВиртуальная память: Доступнo, % " + procFreeMemory);
        char domainName = 'A';
        boolean availableHyperV = true;
        System.out.println("Домен " + domainName + "\nРасширения режима мониторинга виртуальной машины " + availableHyperV);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount  = 11;
        int totalAmount = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки, руб. " + totalAmount);
        System.out.println("Сумма скидки, руб. " + (totalAmount * discount/100));
        System.out.println("Общая стоимость товаров со скидкой, руб. " + (totalAmount - totalAmount * discount/100));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte myByte = 127;
        short myShort = 32_767;
        int myInt = 2_147_483_647;
        long myLong = Long.MAX_VALUE;
        float myFloat = Float.MAX_VALUE;
        double myDouble = Double.MAX_VALUE;
        System.out.println("byte. Первоначальное значение " + myByte + "; значение после инкремента " + (++myByte) + "; значение после декремента " + (--myByte-1));
        System.out.println("short. Первоначальное значение " + myShort + "; значение после инкремента " + (++myShort) + "; значение после декремента " + (--myShort-1));
        System.out.println("int. Первоначальное значение " + myInt + "; значение после инкремента " + (++myInt) + "; значение после декремента " + (--myInt-1));
        System.out.println("long. Первоначальное значение " + myLong + "; значение после инкремента " + (++myLong) + "; значение после декремента " + (--myLong-1));
        System.out.println("float. Первоначальное значение " + myFloat + "; значение после инкремента " + (++myFloat) + "; значение после декремента " + (--myFloat-1));
        System.out.println("double. Первоначальное значение " + myDouble + "; значение после инкремента " + (++myDouble) + "; значение после декремента " + (--myDouble-1));

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью третьей переменной. Исходные значения: a =  " + a + "; b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);
        System.out.println("\nПерестановка с помощью арифметических операций. Исходные значения: a =  " + a + "; b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);
        System.out.println("\nПерестановка с помощью побитовой операции. Исходные значения: a =  " + a + "; b = " + b );
        a = a ^ b; 
        b = a ^ b;
        a = a ^ b;
        System.out.println("Новые значения: a =  " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char[] listChar = new char[]{'#', '&', '@', '^', '_'};
        for (char m : listChar) {
            int codeSymv = (int)m;
            System.out.println("symbol: " + m + " code: " + codeSymv);
        }

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char s1 = '/';
        char s2 = '\\';
        char s3 = '_';
        char s4 = '(';
        char s5 = ')';
        System.out.println("    " + s1 + s2 + "    ");
        System.out.println("   " + s1 + "  " + s2 + "   ");
        System.out.println("  " + s1 + s3 + s4 + " " + s5 + s2 + "  ");
        System.out.println(" " + s1 + "      " + s2 + " ");
        System.out.println("" + s1 + s3 + s3 + s3 + s3 + s1 + s2 + s3 + s3 + s2);
  
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int initNumber = 123;
        int hundreds = initNumber / 100;
        int dozens = (initNumber - hundreds * 100) / 10;
        int units = (initNumber - hundreds * 100 - dozens * 10);
        System.out.println("Число " + initNumber + " содержит:\n" + hundreds + " сотен\n" + dozens + " десятков\n" + units + " единиц");
        System.out.println("Сумма его цифр =  " + (hundreds + dozens + units));
        System.out.println("Произведение  =  " + (hundreds * dozens * units));

        System.out.println("\n9. Вывод времени");
        int sek = 86399;
        int hours = sek / 3600;
        int min = (sek - hours *3600) / 60;
        sek = (sek - hours *3600 - min * 60);
        System.out.println(hours + ":" + min + ":" + sek);
        //System.out.println("minutes " + min);
        //System.out.println(a - a % 100);
/*
        int b = 5;
        int c = a ^ b;
        char[] listChar = new char[]{35, 38, 64, 94, 95};
        char myChar = 35;
        //System.out.println(myChar);S
        for (char m : listChar) {
            System.out.println((int)m);
        }
        /*
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        */
    }
}