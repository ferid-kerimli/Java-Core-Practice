package week04;

public class ArrayOfPoints {
    public int a;
    public int b;

    public  ArrayOfPoints(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public static void main(String[] args) {
        ArrayOfPoints[] points = {
            new ArrayOfPoints(0, 0),
            new ArrayOfPoints(1, 1),
            new ArrayOfPoints(1, 2),
            new ArrayOfPoints(10, 20),
            new ArrayOfPoints(20, 20)
        };

        ArrayOfPoints northern = points[0];
        ArrayOfPoints southern = points[0];
        ArrayOfPoints western = points[0];
        ArrayOfPoints eastern = points[0];

        for (ArrayOfPoints point : points) {
            if (point.b > northern.b) {
                northern = point;
            }
            if (point.b < southern.b) {
                southern = point;
            }
            if (point.a < western.a) {
                western = point;
            }
            if (point.a > eastern.a) {
                eastern = point;
            }
        }
        System.out.println("Northern: (" + northern.a + ", " + northern.b + ")");
        System.out.println("Southernmost: (" + southern.a + ", " + southern.b + ")");
        System.out.println("Westernmost: (" + western.a + ", " + western.b + ")");
        System.out.println("Easternmost: (" + eastern.a + ", " + eastern.b + ")");
    }
}
