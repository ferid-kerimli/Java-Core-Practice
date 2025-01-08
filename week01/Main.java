package week01;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        // Scanner: , we are using scanner for getting input from people.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        // Getting name from person:
        String name = scanner.nextLine();
        // Printing:
        System.out.println("Hello," + " " + name);
        // Scanner close, we are using this to show that our scanner finished its work
        scanner.close();
    }
}

class Task2 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        int num1 = scanner1.nextInt();
        int num2 = scanner1.nextInt();
        int num3 = scanner1.nextInt();

        int sum1 = num1 + num2 + num3;

        System.out.println(sum1);
        
        scanner1.close();
    }
}

class Task3 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);

        int number1 = scanner2.nextInt();
        long number2 = scanner2.nextInt();
        float number3 = scanner2.nextInt();

        double sum2 = number1 + number2 + number3;
        System.out.println(sum2);

        scanner2.close();        
    }
}

class Task4 {
    public static void main(String[] args) {
        double res = (1/5) * (2/3) - (3/10);

        // After printing "println" adds a newline
        System.out.println(res);

        // If we write print output will be on same line
        System.out.print(res);

        // "printf" allows to format output with format specifiers
        System.out.printf("%.4%n", res);
    }
}

class Task5 {
    public static void main(String[] args) {
        int value = 10;
        
        // Integer format:
        System.out.println("Integer value: " + value);
        // Hexadecimal format:
        System.out.println("Hexadecimal value: " + Integer.toHexString(value));
        // Octal format:
        System.out.println("Octal value: " + Integer.toOctalString(value));

        float value1 = 4.32f;

        // Float value:
        System.out.println("float value: " + value1);
        // Decimal-floating point format:
        System.out.println("Decimal-floating point value: " + value1);
        // Scientific Notation format:
        System.out.println("Scientific Notation: %.2e%n: " + value1);
    }
}
