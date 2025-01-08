package week02;

import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting input from user:
        System.out.println("Enter double-precision floating-point number: ");
        double num = scanner.nextDouble();

        // Checking number is positive, negative or neutral:
        if (num > 0) {
            System.out.println("Positive");
        }
        else if (num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        // Closing scanner:
        scanner.close();
    }
}
