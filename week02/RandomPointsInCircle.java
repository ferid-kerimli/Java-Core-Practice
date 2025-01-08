package week02;

import java.util.Random;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        int n = 10;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            // X coordinate:
            double x = -1 + 2 * random.nextDouble();
            // Y coordinate:
            double y = -1 + 2 * random.nextDouble();       
            
            // Printing result:
            if (x * x + y * y <= 1) {
                System.out.println("(" + x + ", " + y + ")");
            }
            else {
                i--;
            }
        }
    }
}
