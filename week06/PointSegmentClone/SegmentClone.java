package week06.PointSegmentClone;

public class SegmentClone implements Cloneable {
    private PointClone firstPoint;
    private PointClone secondPoint;

    public SegmentClone(PointClone firstPoint, PointClone secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public SegmentClone(float x1, float y1, float x2, float y2) {
        this.firstPoint = new PointClone(x1, y1);
        this.secondPoint = new PointClone(x2, y2);
    }

    public PointClone getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(PointClone firstPoint) {
        this.firstPoint = firstPoint;
    }

    public PointClone getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(PointClone secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void translate(float dX, float dY) {
        firstPoint.translate(dX, dY);
        secondPoint.translate(dX, dY);
    }

    public float length() {
        return firstPoint.distance(secondPoint);
    }

    public boolean equals(SegmentClone s) {
        return firstPoint.equals(s.getFirstPoint()) && secondPoint.equals(s.getSecondPoint());
    }

    public float slope() {
        if (firstPoint.getX() != secondPoint.getX()) {
            return (secondPoint.getY() - firstPoint.getY()) / (secondPoint.getX() - firstPoint.getX());
        } else {
            return Float.NaN;
        }
    }

    public float intercept() {
        return firstPoint.getY() - slope() * firstPoint.getX();
    }

    public boolean onLine(PointClone P) {
        return P.getY() == (slope() * P.getX() + intercept());
    }

    public boolean onSegment(PointClone P) {
        return onLine(P) && (P.getX() >= Math.min(firstPoint.getX(), secondPoint.getX()) && P.getX() <= Math.max(firstPoint.getX(), secondPoint.getX()) && P.getY() >= Math.min(firstPoint.getY(), secondPoint.getY()) && P.getY() <= Math.max(firstPoint.getY(), secondPoint.getY()));
    }

    @Override
    public SegmentClone clone() {
        return new SegmentClone(this.firstPoint.clone(), this.secondPoint.clone());
    }
}