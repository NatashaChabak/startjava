public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        char sign = '/';
        float result = 0f;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            float af = a;
            float bf = b;
            result = af / bf;
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Cannot recognize sign " + sign);
            return;
        }
        System.out.println("" + a + " " + sign + " " + b + " = " + result);
    }
}