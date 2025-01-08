package week02;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        
        double sum = 0;
        int product = 1;
        int count = 0;     
               
       
        while (number > 0 || number < 0) {
            int digit = number % 10; 
            sum += digit; 
            product *= digit;
            count++; 
            
            number = number / 10; 
        }
        
        double average = sum / count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
