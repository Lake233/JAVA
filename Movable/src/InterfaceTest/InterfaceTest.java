package InterfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        MovablePoint MP = new MovablePoint(1, 2, 3,4);
        MP.moveUp();
        MP.moveDown();
        MP.moveLeft();
        MP.moveRight();
        MovableCircle MC = new MovableCircle(1, 2, 3, 4, 5);
        MC.moveUp();
        MC.moveDown();
        MC.moveLeft();
        MC.moveRight();
    }
}
