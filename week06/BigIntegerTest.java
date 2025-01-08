package week06;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        Factorial();
        Power();
    }

    public static void Factorial() {
        int n = 5;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void Power() {
        int base = 2;
        int exponent = 10;
        BigInteger res = BigInteger.valueOf(base).pow(exponent);
        System.out.println(base + " to the power of " + exponent + " is " + res);
    }
}
