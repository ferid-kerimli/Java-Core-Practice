package week12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class javaUtilFunctionPakcage {
    public static void main(String[] args) {
        Consumer<String> Print = s -> System.out.println(s);
        Print.accept("Hello World");

        Function<Integer, String> converter = num -> String.valueOf(num);
        String result = converter.apply(42);

        Predicate<Integer> isPositive = num -> num > 0;
        boolean positive = isPositive.test(5);

        Supplier<Double> randomValue = () -> Math.random();
        double value = randomValue.get();
    }
}
