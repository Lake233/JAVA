package MultipleInterfaceTest;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        System.out.println("The circle has been resized to " + percent + "%");
    }
}
