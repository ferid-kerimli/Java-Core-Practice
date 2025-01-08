package week06;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        // Example a: 2.35 - 1.95
        BigDecimal resultA = new BigDecimal("2.35").subtract(new BigDecimal("1.95"));
        System.out.println("Result of 2.35 - 1.95: " + resultA);

        // Example b: 1000000.0f + 1.2f - 1000000.0f
        BigDecimal resultB = new BigDecimal("1000000.0").add(new BigDecimal("1.2")).subtract(new BigDecimal("1000000.0"));
        System.out.println("Result of 1000000.0 + 1.2 - 1000000.0: " + resultB);
    }
}
