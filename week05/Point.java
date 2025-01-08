package week05;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point P) {
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

    public float distance(Point P) {
        float dx = this.x - P.getX();
        float dy = this.y - P.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Point P) {
        return this.x == P.getX() && this.y == P.getY();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return Float.compare(point.x, x) == 0 && Float.compare(point.y, y) == 0;
    }
}
