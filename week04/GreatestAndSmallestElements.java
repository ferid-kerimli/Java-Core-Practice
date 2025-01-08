package week04;

import java.util.Scanner;

public class GreatestAndSmallestElements {
    public static void main(String[] args) {
        int[] arrayCommandLine = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arrayCommandLine[i] = Integer.parseInt(args[i]);
        }
        CalandPrintMinMax(arrayCommandLine);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arrayScanner = new int[size];
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < size; i++) {
            arrayScanner[i] = scanner.nextInt();
        }

        CalandPrintMinMax(arrayScanner);

        scanner.close();                
    }

    // Method for calculating minimum value
    public static int CalMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method for calculating maximum value
    public static int CalMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method for calculating both of them
    public static int[] CalMinMax(int[] array) {
        int min = CalMin(array);
        int max = CalMax(array);
        return new int[] {min, max};
    }

    public static void CalandPrintMinMax(int[] array) {
        int[] minmax = CalMinMax(array);
        System.out.println("Minimum: " + minmax[0]);
        System.out.println("Maximum: " + minmax[1]);
    }
}
