package week10;

import java.util.Arrays;

public class PracticingGenericMethods {
    public static void main(String[] args) {
        // Arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] stringArray = {"Farid", "Omar", "Rashad", "Cavid"};
        Task[] taskArray = {new Task("Task1"), new Task("Task2"), new Task("Task3"), new Task("Task4")};
        Point[] pointArray = {new Point(1,1), new Point(2,2), new Point(3,3)};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);

        printArray(intArray, 1,3);
        printArray(doubleArray, 0, 2);
        printArray(stringArray, 2, 4);
        printArray(taskArray, 0, 2);
        printArray(pointArray, 1, 3);

        // Print middle element of arrays
        System.out.println("Middle element of intArray: " + getMiddleElement(intArray));
        System.out.println("Middle element of doubleArray: " + getMiddleElement(doubleArray));
        System.out.println("Middle element of stringArray: " + getMiddleElement(stringArray));
        System.out.println("Middle element of taskArray: " + getMiddleElement(taskArray));
        System.out.println("Middle element of pointArray: " + getMiddleElement(pointArray));

        // Print maximum element of arrays
        System.out.println("Maximum element of intArray: " + getMaxElement(intArray));
        System.out.println("Maximum element of doubleArray: " + getMaxElement(doubleArray));
        System.out.println("Maximum element of stringArray: " + getMaxElement(stringArray));
        System.out.println("Maximum element of taskArray: " + getMaxElement(taskArray));
        System.out.println("Maximum element of pointArray: " + getMaxElement(pointArray));

        // Sort arrays
        sortArray(intArray);
        sortArray(doubleArray);
        sortArray(stringArray);
        sortTasks(taskArray);
        sortPoints(pointArray);

        // Print sorted arrays
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));
        System.out.println("Sorted doubleArray: " + Arrays.toString(doubleArray));
        System.out.println("Sorted stringArray: " + Arrays.toString(stringArray));
        System.out.println("Sorted taskArray: " + Arrays.toString(taskArray));
        System.out.println("Sorted pointArray: " + Arrays.toString(pointArray));
    }

    // Method for printing arrays
    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Overloading printArray method
    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IllegalArgumentException("Invalid range specified");
        }
        for (int i = lowerIndex; i <upperIndex; i++) {
            System.out.println(array[i]);
        }
    }

    // Middle element
    public static <T> T getMiddleElement(T[] array) {
        return array[array.length / 2];
    }

    // Maximum element of array
    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Sorting array
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    // Swap method
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sortTasks(Task[] tasks) {
        Arrays.sort(tasks, (t1, t2) -> t1.name.compareTo(t2.name));
    }

    public static void sortPoints(Point[] points) {
        Arrays.sort(points, (p1, p2) -> {
            int result = Integer.compare(p1.x, p2.x);
            if (result == 0) {
                result = Integer.compare(p1.y, p2.y);
            }
            return result;
        });
    }

    static class Task implements Comparable<Task> {
        String name;
        public Task(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Task other) {
            return this.name.compareTo(other.name);
        }
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point other) {
            if (this.x == other.x) {
                return Integer.compare(this.y, other.y);
            }
            return Integer.compare(this.x, other.x);
        }

        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + '}';
        }
    }
}
