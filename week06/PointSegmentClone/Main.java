package week06.PointSegmentClone;

public class Main {
    public static void main(String[] args) {
        
        PointClone p1 = new PointClone(1, 2);
        PointClone p2 = new PointClone(3, 4);
        
        SegmentClone segment1 = new SegmentClone(p1, p2);
        
        PointClone clonedPoint = p1.clone();
        SegmentClone clonedSegment = segment1.clone();
        
        System.out.println("Original point: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Cloned point: (" + clonedPoint.getX() + ", " + clonedPoint.getY() + ")");
        
        System.out.println("Original segment length: " + segment1.length());
        System.out.println("Cloned segment length: " + clonedSegment.length());
        
        segment1.translate(1, 1);
        
        System.out.println("Original segment length after translation: " + segment1.length());
        System.out.println("Cloned segment length after translation: " + clonedSegment.length());
        
        System.out.println("Original point equals cloned point: " + p1.equals(clonedPoint));
        
        System.out.println("Original segment equals cloned segment: " + segment1.equals(clonedSegment));
    }
}
