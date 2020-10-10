package geo;

public class Circle {
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius *radius;
    }

    public double getCircumferenc(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        System.out.println(c1.getRadius());
        c2.setRadius(3.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumferenc());
    }
}
