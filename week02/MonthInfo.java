package week02;

import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting input from user:        
        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = scanner.nextInt();

        // Switch-case for printing result and checking months:
        switch (monthNumber) {
            case 1:
                System.out.println("January: 31 days");
                break;
            case 2:
                System.out.println("February: 28 or 29 days (leap year)");
                break;
            case 3:
                System.out.println("March: 31 days");
                break;
            case 4:
                System.out.println("April: 30 days");
                break;
            case 5:
                System.out.println("May: 31 days");
                break;
            case 6:
                System.out.println("June: 30 days");
                break;
            case 7:
                System.out.println("July: 31 days");
                break;
            case 8:
                System.out.println("August: 31 days");
                break;
            case 9:
                System.out.println("September: 30 days");
                break;
            case 10:
                System.out.println("October: 31 days");
                break;
            case 11:
                System.out.println("November: 30 days");
                break;
            case 12:
                System.out.println("December: 31 days");
                break;
            default:
                System.out.println("Error, month number must be between 1 and 12");    
        }

        // Closing scanner:
        scanner.close();
    }
}
