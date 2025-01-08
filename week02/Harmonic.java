package week02;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            double harmonicNumber = calculateHarmonicNumber(n);
            System.out.println(n + "th harmonic number is: " + harmonicNumber);
        } 
        else {
            System.out.println("Error, You need to enter positive number");
        }

        scanner.close();
    }

    
    static double calculateHarmonicNumber(int n) {
        double harmonicNumber = 0;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1 / i;
        }

        return harmonicNumber;
    }
}
