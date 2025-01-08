package week02;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int number = scanner.nextInt();

        boolean Prime = true;

        // If integer's value is less than 2 it can not be prime number:
        if (number < 2) {
            Prime = false;
        }
        else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }

        scanner.close();
    }
}
