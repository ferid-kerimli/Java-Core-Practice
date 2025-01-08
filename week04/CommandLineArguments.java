package week04;

public class CommandLineArguments {
    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int Num : arr) {
            System.out.println(Num + " ");
        }
        System.out.println();
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int Num : arr) {
            sum += Num;
        }
        return sum;
    }

    public static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    public static boolean isInteger(String a) {
        if (a == null || a.isEmpty()) {
            return false;
        }

        int length = a.length();
        int i = 0;
        
        if (a.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = a.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error");
            return;
        }

        System.out.println("Elements: ");
        for (String arg : args) {
            System.out.println(arg + " ");
        }
        System.out.println();

        boolean isValid = true;
        for (String arg : args) {
            if (!isInteger(arg)) {
                System.out.println("Argument '" + arg + "' is not an integer");
                isValid = false;
                break;
            }
        }

        if (isValid) {
            int[] integers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                integers[i] = Integer.parseInt(args[i]);
            }
            printArray(integers);
            int arraySum = sumArray(integers);
            double arrayAverage = averageArray(integers);
            System.out.println("Array sum: " + arraySum);
            System.out.println("Array average: " + arrayAverage);
        }
    }
}
