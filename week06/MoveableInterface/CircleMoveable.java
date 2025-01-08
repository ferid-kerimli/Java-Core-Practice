package week06.moveableinterface;

public class CircleMoveable implements Movable {
    private PointMoveable center;
    private float radius;

    public CircleMoveable(PointMoveable center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public PointMoveable getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void moveUp(float distance) {
        center.moveUp(distance);
    }

    @Override
    public void moveDown(float distance) {
        center.moveDown(distance);
    }

    @Override
    public void moveLeft(float distance) {
        center.moveLeft(distance);
    }

    @Override
    public void moveRight(float distance) {
        center.moveRight(distance);
    }

    public void changeRadius(float newRadius) {
        this.radius = newRadius;
    }

    public void resize(float newRadius) {
        this.radius = newRadius;
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}