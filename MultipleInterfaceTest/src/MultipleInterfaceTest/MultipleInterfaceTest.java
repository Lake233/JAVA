package MultipleInterfaceTest;

public class MultipleInterfaceTest {
    public static void main(String[] args) {
        Circle C = new Circle(3.0);
        System.out.println(C.getPerimeter());
        System.out.println(C.getArea());
        ResizableCircle RC = new ResizableCircle(2.0);
        RC.resize(50);
    }
}
