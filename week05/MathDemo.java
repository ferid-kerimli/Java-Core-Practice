package week05;

public class MathDemo {
    public static int Min (int a, int b) {
        return Math.min(a, b);
    }

    public static int Max (int a, int b) {
        return Math.max(a, b);
    }

    public static int Sum (int[] numbers) {

        int sum = 0;
    
        for (int num : numbers) {
            sum  += num;
        }
        return sum;
    }

    public static double Mean(int[] numbers) {

        if (numbers.length == 0) {
            return 0;
        }
        int sum = Sum(numbers);
        return (double)sum / numbers.length;
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}