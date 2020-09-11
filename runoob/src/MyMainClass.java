class OuterClass{
    int x = 10;
    class InnerClass{
        int y = 5;
    }
}
public class MyMainClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y + outerClass.x);
    }
}
