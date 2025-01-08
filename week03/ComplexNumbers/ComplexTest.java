package week03.ComplexNumbers;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Are they equal? " + num1.equals(num2));
        System.out.println("Conjugate of Number 1: " + num1.conjugate());
        System.out.println("Absolute value of Number 1: " + num1.abs());
        System.out.println("Addition: " + num1.add(num2));
        System.out.println("Subtraction: " + num1.sub(num2));
        System.out.println("Multiplication: " + num1.mult(num2));
        System.out.println("Power: " + num1.power(3));
    }
}
