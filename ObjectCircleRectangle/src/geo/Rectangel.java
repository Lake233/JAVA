package geo;

public class Rectangel {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangel() {
    }

    public Rectangel(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangel{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {
        Rectangel r1 = new Rectangel();
        Rectangel r2 = new Rectangel(4.0f, 2.0f);
        System.out.println(r1.getLength());
        r1.setLength(2.0f);
        System.out.println(r1.getWidth());
        r1.setWidth(2.0f);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
