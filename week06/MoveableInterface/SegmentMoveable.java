package week06.moveableinterface;

public class SegmentMoveable implements Movable {
    private PointMoveable firstPoint;
    private PointMoveable secondPoint;

    public SegmentMoveable(PointMoveable firstPoint, PointMoveable secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public void moveUp(float distance) {
        firstPoint.moveUp(distance);
        secondPoint.moveUp(distance);
    }

    @Override
    public void moveDown(float distance) {
        firstPoint.moveDown(distance);
        secondPoint.moveDown(distance);
    }

    @Override
    public void moveLeft(float distance) {
        firstPoint.moveLeft(distance);
        secondPoint.moveLeft(distance);
    }

    @Override
    public void moveRight(float distance) {
        firstPoint.moveRight(distance);
        secondPoint.moveRight(distance);
    }

    @Override
    public String toString() {
        return "Segment [firstPoint=" + firstPoint + ", secondPoint=" + secondPoint + "]";
    }
}