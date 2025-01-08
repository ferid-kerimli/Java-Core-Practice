package week04;

import javax.swing.text.Segment;

public class ArrayOfSegments {
    public static Segment[] findSegmentsWithMinimumLength(Segment[] segments) {
        double minimumLength = Double.MAX_VALUE;
        int count = 0;

        for (Segment segment : segments) {
            if (segment.length() < minimumLength) {
                minimumLength = segment.length();
                count = 1;
            }
            else if (segment.length() == minimumLength) {
                count++;
            }
        }

        Segment[] segmentWithMinimumElements = new Segment[count];

        int i = 0;
        for (Segment segment : segments) {
            if (segment.length() == minimumLength) {
                segmentWithMinimumElements[i++] = segment;
            }
        }

        return segmentWithMinimumElements;
    }
}
