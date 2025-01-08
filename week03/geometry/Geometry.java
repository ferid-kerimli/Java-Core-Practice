package week03.geometry;

public class Geometry {
    public static void main(String[] args) {
        Point fisrPoint = new Point(1.0f, 2.0f);
        Point secondPoint = new Point(3.0f, 4.0f);

        System.out.println("Points:");
        displayPoint("Point A", fisrPoint);
        displayPoint("Point B", secondPoint);

        Segment segment = new Segment(fisrPoint, secondPoint);

        System.out.println("\nsegment:");
        displaySegment("Segment", segment);

        segment.translate(1.0f, 2.0f);
        System.out.println("\nTranslation:");
        displaySegment("Segment", segment);
        System.out.println("Segment length: " + segment.length());

        Point testPoint = new Point(2.0f, 3.0f);
        System.out.println("\nPoint on Line: " + segment.OnLine(testPoint));
        System.out.println("Point on Segment: " + segment.OnSegment(testPoint));
    }

    private static void displayPoint(String name, Point point) {
        System.out.println(name + ": (" + point.getX() + ", " + point.getY() + ")");
    }

    private static void displaySegment(String name, Segment segment) {
        System.out.println(name + ": (" + segment.getfirstPoint().getX() + ", " + segment.getfirstPoint().getY() + ") - (" + segment.getsecondPoint().getX() + ", " + segment.getsecondPoint().getY() + ")");
    }
}