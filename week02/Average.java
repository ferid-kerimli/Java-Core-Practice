package week02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Scanner:
        Scanner scanner = new Scanner(System.in);

        // Input:
        System.out.println("Enter numbers: ");

        double sum = 0;
        int count = 0;

        // Getting inputs until it user stop code:
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sum += number;
                count++;                
            }
            else {
                scanner.next();
            }
        }

        // Closing scanner:
        scanner.close();

        // Printing result:
        if (count == 0) {
            System.out.println("Error");
        }
        else {
            double Average = sum / count;
            System.out.println("Avaregae: " + Average);
        }
    }
}
