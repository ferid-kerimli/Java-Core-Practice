package week10;

public class NumericFunction <T extends Number> {
    private final T value;

    public NumericFunction(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() % 1;
    }

    public boolean checkAbsoluteEquality(T otherValue) {
        return Math.abs(value.doubleValue()) == Math.abs(otherValue.doubleValue());
    }

    public static void main(String[] args) {
        NumericFunction<Double> Functions = new NumericFunction<>(9.76);
        System.out.println("Reciprocal: " + Functions.reciprocal());
        System.out.println("Fractional Part: " + Functions.fractionalPart());
        System.out.println("Absolute Equality with 9.76: " + Functions.checkAbsoluteEquality(9.76));
        System.out.println("Absolute Equality with -9.76: " + Functions.checkAbsoluteEquality(-9.76));
    }
}
