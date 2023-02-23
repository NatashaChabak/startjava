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
        int totalAmount = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки, руб. " + totalAmount);
        int discountAmount = totalAmount * discount/100;
        System.out.println("Сумма скидки, руб. " + discountAmount);
        int finalAmount = totalAmount - discountAmount;
        System.out.println("Общая стоимость товаров со скидкой, руб. " + finalAmount);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte exampleByte = 127;
        short exampleShort = 32_767;
        int exampleInt = 2_147_483_647;
        long exampleLong = Long.MAX_VALUE;
        float exampleFloat = Float.MAX_VALUE;
        double exampleDouble = Double.MAX_VALUE;
        System.out.println("byte. Первоначальное значение " + exampleByte + 
                           "; значение после инкремента " + (++exampleByte) + 
                           "; значение после декремента " + (--exampleByte-1));
        System.out.println("short. Первоначальное значение " + exampleShort + 
                           "; значение после инкремента " + (++exampleShort) + 
                           "; значение после декремента " + (--exampleShort-1));
        System.out.println("int. Первоначальное значение " + exampleInt + 
                           "; значение после инкремента " + (++exampleInt) + 
                           "; значение после декремента " + (--exampleInt-1));
        System.out.println("long. Первоначальное значение " + exampleLong + 
                           "; значение после инкремента " + (++exampleLong) + 
                           "; значение после декремента " + (--exampleLong-1));
        System.out.println("float. Первоначальное значение " + exampleFloat + 
                           "; значение после инкремента " + (++exampleFloat) +
                           "; значение после декремента " + (--exampleFloat-1));
        System.out.println("double. Первоначальное значение " + exampleDouble + 
                           "; значение после инкремента " + (++exampleDouble) + 
                           "; значение после декремента " + (--exampleDouble-1));

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
        char charValue = '#';
        int symboleCode = (int) charValue;
        System.out.println(charValue + " " + symboleCode);
        charValue = '&';
        symboleCode = (int) charValue;
        System.out.println(charValue + " " + symboleCode);
        charValue = '@';
        symboleCode = (int) charValue;
        System.out.println(charValue + " " + symboleCode);
        charValue = '^';
        symboleCode = (int) charValue;
        System.out.println(charValue + " " + symboleCode);
        charValue = '_';
        symboleCode = (int) charValue;
        System.out.println(charValue + " " + symboleCode);

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
        int dozens = initNumber / 10 % 10;
        int units = initNumber % 10;
        System.out.println("Число " + initNumber + " содержит:\n" + hundreds + 
                           " сотен\n" + dozens + " десятков\n" + units + " единиц");
        System.out.println("Сумма его цифр =  " + (hundreds + dozens + units));
        System.out.println("Произведение  =  " + (hundreds * dozens * units));

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds - hours *3600) / 60;
        seconds = (seconds - hours *3600 - minutes * 60);
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}