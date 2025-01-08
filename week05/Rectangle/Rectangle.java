package week05.Rectangle;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || !(obj instanceof Rectangle)) {
            return false;
        }
        
        Rectangle rect = (Rectangle) obj;
        return this.width == rect.width && this.height == rect.height;
    }
}    