package week12;

interface Calculator {
    double Calculate(double a, double b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.Calculate(9,5));

        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.Calculate(9,5));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.Calculate(9,5));

        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.Calculate(9,5));

        Calculator exponentiation = Math::pow;
        System.out.println("Exponentiation: " + exponentiation.Calculate(9,5));
    }
}
