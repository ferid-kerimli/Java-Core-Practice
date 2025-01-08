package week04;

import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = {1,2,4,4,5,7,8,9,8,7,8};
        int[] histogram = createHistogram(grades);
        System.out.println("Histogram: ");

        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > 0) {
                System.out.println("Grade " + i + ": " + histogram[i] + " students");
            }
        }

        double mean = calMean(grades);
        int median = calMedian(grades);
        int mode = calMode(grades);

        System.out.println("\nMean: " + mean);
        System.out.println("Median " + median);
        System.out.println("Mode: " + mode);
    }

    // Mehthod for creating histogram
    public static int[] createHistogram(int[] grades) {
        int[] histogram = new int[11];
        for (int grade : grades) {
            histogram[grade]++;
        }
        return histogram;
    }

    // Method to calculate mean
    public static double calMean(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to calculate the mode
    public static int calMode(int[] grades) {
        int mode = 0;
        int maxApp = 0;
        
        for (int grade = 0; grade <= 10; grade++) {
            int app = 0;
            for (int g : grades) {
                if (g == grade) {
                    app++;
                }
            }

            if (app > maxApp) {
                maxApp = app;
                mode = grade;
            }
        }
        return mode;
    }

    // Method to calculate median
    public static int calMedian(int[] grades) {
        int[] sortedGrades = grades.clone();
        Arrays.sort(sortedGrades);

        if (sortedGrades.length % 2 == 0) {
            return (sortedGrades[sortedGrades.length/ 2 - 1] + sortedGrades[sortedGrades.length / 2]) / 2;
        } else {
            return sortedGrades[sortedGrades.length / 2];
        }
    }
}
