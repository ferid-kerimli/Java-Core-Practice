package week02;

public class TaylorSin {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);

        double result = 0;
        double factorial = 1;

        for (int i = 0; i < n; i++) {
            factorial *= (2 * i + 1);
            result += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial;
        }

        System.out.println("Taylor series: " + result);
        System.out.println("sin(x): " + Math.sin(x));
    }
}
