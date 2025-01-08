package week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting input from user:
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Being sure that num1 is smaller than num2:
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            // Checking if number is odd:
            if (i % 2 != 0) {
                // Adding odd number to the sum
                sum += i; 
            }
        }

        // Printing result:
        System.out.println("Sum of odd numbers between " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
