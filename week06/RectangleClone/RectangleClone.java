package week06.rectangleclone;

import week05.Rectangle.Rectangle;

public class RectangleClone implements Cloneable {
    int width, height;
    public RectangleClone(int width, int  height) {
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

        RectangleClone rect = (RectangleClone) obj;
        return this.width == rect.width && this.height == rect.height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public  String toString() {
        return "RectangleClone{" + "width=" + width + ", height=" + height + '}';
    }
}