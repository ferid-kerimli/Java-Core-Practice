package week02;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values: ");

        if (scanner.hasNextDouble()) {
            double firstNum = scanner.nextDouble();
            double min = firstNum;
            double max = firstNum;
            
            while (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
        else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
