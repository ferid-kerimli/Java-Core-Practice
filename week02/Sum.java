package week02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting first number:
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Getting second number:
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Printing sum:
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Closing scanner:
        scanner.close();
    }
}
