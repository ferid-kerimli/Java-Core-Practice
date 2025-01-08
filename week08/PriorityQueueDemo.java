package week08;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = scanner.nextInt();

        PriorityQueue<Integer> breadPriorityQueue = new PriorityQueue<>();

        System.out.println("Enter the number of pieces of bread for each person:");
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            int bread = scanner.nextInt();
            breadPriorityQueue.offer(bread);
        }

        System.out.print("Enter the total amount of bread in the store: ");
        int totalBread = scanner.nextInt();

        scanner.close();

        int personsCanBuy = 0;
        while (!breadPriorityQueue.isEmpty() && totalBread >= breadPriorityQueue.peek()) {
            totalBread -= breadPriorityQueue.poll();
            personsCanBuy++;
        }

        System.out.println("Maximum number of persons who can buy: " + personsCanBuy);
    }
}
