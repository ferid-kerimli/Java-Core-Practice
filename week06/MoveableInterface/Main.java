package week06.moveableinterface;

public class Main {
    public static void main(String[] args) {
        
        Movable[] movables = new Movable[3];
        movables[0] = new PointMoveable(1, 1);
        movables[1] = new SegmentMoveable(new PointMoveable(2, 2), new PointMoveable(3, 3));
        movables[2] = new CircleMoveable(new PointMoveable(4, 4), 5);

        moveAll(movables, 2);

        for (Movable movable : movables) {
            System.out.println(movable);
        }
    }

    public static void moveAll(Movable[] movables, float distance) {
        for (Movable movable : movables) {
            movable.moveRight(distance);
        }
    }
}