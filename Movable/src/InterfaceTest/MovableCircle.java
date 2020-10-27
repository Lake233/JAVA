package InterfaceTest;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        System.out.println("Circle Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Circle Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Circle Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Circle Right");
    }
}
