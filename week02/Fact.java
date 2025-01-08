package week02;

public class Fact {
    public static void main(String[] args) {
        // Checking if a number is command-line argument:
        if (args.length != 1) {
            System.out.println("Error");
            return;
        }

        // Converting to integer:
        int num = Integer.parseInt(args[0]);

        // Checking negative numbers:
        if (num < 0) {
            System.out.println("Error, factorial can not be defined for negative numbers");
        }
        else {
            // Calculating factorial:
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
