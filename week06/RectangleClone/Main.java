package week06.rectangleclone;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        RectangleClone originalRectangle = new RectangleClone(10, 20);

        RectangleClone clonedRectangle = (RectangleClone) originalRectangle.clone();

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
        System.out.println("Objects equal: " + originalRectangle.equals(clonedRectangle));

        clonedRectangle.width = 15;

        System.out.println("\nAfter modifying the cloned rectangle:");
        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
        System.out.println("Objects equal: " + originalRectangle.equals(clonedRectangle));
    }
}
