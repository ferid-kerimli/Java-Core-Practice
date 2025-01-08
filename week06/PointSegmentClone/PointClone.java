package week06.PointSegmentClone;

public class PointClone implements Cloneable {
    private float x;
    private float y;

    public PointClone() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public PointClone(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public PointClone(PointClone P) {
        this.x = P.getX();
        this.y = P.getY();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        if (x > 0) {
            this.x = x;
        } else {
            System.out.println("Error");
        }
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(PointClone P) {
        float dx = this.x - P.getX();
        float dy = this.y - P.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(PointClone P) {
        return this.x == P.getX() && this.y == P.getY();
    }

    @Override
    public PointClone clone() {
        return new PointClone(this.x, this.y);
    }
}