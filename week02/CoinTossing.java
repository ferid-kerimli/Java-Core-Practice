package week02;

import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = scanner.nextInt();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < n; i++) {
            // Math random:
            double randomValue = Math.random();

            if (randomValue < 0.5) {
                tailsCount++;
            }
            else {
                headsCount++;
            }
        }

        double headsProbability = headsCount / n;
        double tailsProbability = tailsCount / n;

        // Results:
        System.out.println("Output after " + n + " coin tosses:");
        System.out.println("Heads: " + headsCount + " times");
        System.out.println("Tails: " + tailsCount + " times");
        System.out.println("Probability of Heads: " + headsProbability);
        System.out.println("Probability of Tails: " + tailsProbability);

        scanner.close();
    }
}
