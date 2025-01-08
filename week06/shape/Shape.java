package week06.shape;

public abstract class Shape implements Resizeable{
    protected String color;
    protected Boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape [color = " + color + ", filled= " + filled + "]";
    }

    public abstract double getArea();
    
    public abstract double getPerimeter();

}