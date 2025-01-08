package week03.geometry;

public class Segment {
    private Point firstPoint;
    private Point secondPoint;

    public Segment(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.firstPoint = new Point(x1, y1);
        this.secondPoint = new Point(x2, y2);
    }

    public Point getfirstPoint() {
        return firstPoint;
    }

    public void setfirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getsecondPoint() {
        return secondPoint;
    }

    public void setsecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void translate(float dX, float dY) {
        firstPoint.translate(dX, dY);
        secondPoint.translate(dX, dY);
    }

    public float length() {
        return firstPoint.distance(secondPoint);
    }

    public boolean equals(Segment s) {
        return firstPoint.equals(s.getfirstPoint()) && secondPoint.equals(s.getsecondPoint());
    }

    public float Slope() {
        if (firstPoint.getX() != secondPoint.getX()) {
            return (secondPoint.getY() - firstPoint.getY()) / (secondPoint.getX() - firstPoint.getX());
        } else {
            return Float.NaN;
        }
    }

    public float Intercept() {
        return firstPoint.getY() - Slope() * firstPoint.getX();
    }

    public boolean OnLine(Point P) {
        return P.getY() == (Slope() * P.getX() + Intercept());
    }

    public boolean OnSegment(Point P) {
        return OnLine(P) && (P.getX() >= Math.min(firstPoint.getX(), secondPoint.getX()) && P.getX() <= Math.max(firstPoint.getX(), secondPoint.getX()) && P.getY() >= Math.min(firstPoint.getY(), secondPoint.getY()) && P.getY() <= Math.max(firstPoint.getY(), secondPoint.getY()));
    }
}