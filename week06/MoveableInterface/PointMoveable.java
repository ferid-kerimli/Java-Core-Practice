package week06.moveableinterface;

public class PointMoveable implements Movable {
    private float x;
    private float y;

    public PointMoveable(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public void moveUp(float distance) {
        y += distance;
    }

    @Override
    public void moveDown(float distance) {
        y -= distance;
    }

    @Override
    public void moveLeft(float distance) {
        x -= distance;
    }

    @Override
    public void moveRight(float distance) {
        x += distance;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
