package week03.ComplexNumbers;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.real && this.imaginary == number.imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }

    public double re() {
        return real;
    }

    public double imag() {
        return imaginary;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    public ComplexNumber abs() {
        double absValue = Math.sqrt(real * real + imaginary * imaginary);
        return new ComplexNumber(absValue, 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imaginary + number.imaginary);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imaginary - number.imaginary);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newReal = this.real * number.real - this.imaginary * number.imaginary;
        double newImag = this.real * number.imaginary + this.imaginary * number.real;
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber power(int n) {
        if (n == 0) {
            return new ComplexNumber(1, 0);
        } else {
            ComplexNumber result = new ComplexNumber(real, imaginary);
            for (int i = 1; i < n; i++) {
                result = result.mult(this);
            }
            return result;
        }
    }
}
