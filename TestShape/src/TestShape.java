abstract class Shape{
    public String color;
    public boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                ", side=" + side +
                '}';
    }
}
public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", true, 2.0);
        System.out.println(c1.getColor());
        c1.setColor("green");
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        c1.setFilled(false);
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        c1.setRadius(3.0);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Rectangle r1 = new Rectangle("blue", true, 3.0, 5.0);
        System.out.println(r1.getLength());
        r1.setLength(7.0);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        r1.setWidth(5.0);
        System.out.println(r1.getWidth());
        Square s1 = new Square("yellow", true, 4.0);
        System.out.println(s1.getSide());
        s1.setSide(5.0);
        System.out.println(s1.getSide());
    }
}
