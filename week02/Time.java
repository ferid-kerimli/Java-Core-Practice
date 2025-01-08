package week02;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Getting input from user:
        System.out.println("Enter seconds: ");
        int Seconds = scanner.nextInt();

        // Operations:
        int hours = Seconds / 3600;        
        int remainingSeconds = Seconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = Seconds % 60;

        // Printing result:
        System.out.println("Time: " + hours + "hours " + minutes + "minutes " + seconds + "seconds");

        // Closing scanner:
        scanner.close();
    }
}
