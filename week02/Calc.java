package week02;

public class Calc {
    public static void main(String[] args) {
        // Checking two command line args:
        if (args.length != 2) {
            System.out.println("Error");
            System.exit(1);
        }
        // Converting the command-line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Operations:
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;


        int division = 0;
        int remainder = 0;

        //Checking if num2 is different from zero, because it is denominator
        if (num2 != 0) {
            division = num1 / num2;
            remainder = num1 % num2;
        }


        // Printing results:
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        } 
        else {
            System.out.println("error");
        }          
    }
}
