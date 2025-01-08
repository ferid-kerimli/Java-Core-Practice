package week07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = 1;


        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be non-negative");
            }
            else {
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
