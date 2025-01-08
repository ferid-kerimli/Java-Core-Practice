package week08;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of people in queue:");
        int numberOfPeople = scanner.nextInt();

        int[] breadPerPerson = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter the number of pieces of bread for person " + (i + 1) + ": ");
            breadPerPerson[i] = scanner.nextInt();
        }

        System.out.println("Enter the total amount of bread in the store:");
        int totalBread = scanner.nextInt();

        scanner.close();

        int personsCanBuy = 0;
        for (int bread : breadPerPerson) {
            if (bread <= totalBread) {
                personsCanBuy++;
                totalBread -= bread;
            }
            else {
                break;
            }
        }

        System.out.println("Number of persons who can buy bread: " + personsCanBuy);
    }
}
