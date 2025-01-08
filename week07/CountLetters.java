package week07;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts;

        do {
            System.out.print("Enter a word, preferably only English letters (0 to exit): ");
            String word = scan.nextLine();

            if (word.trim().equals("0"))
                break;

            // Checking that if the word contains only alphabetic characters
            if (!word.matches("[a-zA-Z]+")) {
                System.out.println("Invalid input! Please enter a word containing only English letters.");
                continue;
            }

            counts = new int[26];
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'a']++;

            System.out.println("\tHere are the letters:");

            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'a') + ": " + counts[i]);

        } while (true);

        scan.close();
    }
}
