package week02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting input from user:
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if month is a leap year or not and printing result:
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

        // Closing scanner:
        scanner.close();
    }
}
