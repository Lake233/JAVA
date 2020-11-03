public class TryTest {
    public TryTest(){
        try{
            int a[] = new int[2];
            a[4] = 3;
            System.out.println("在异常处理后，会回到这里吗？");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception msg: " + e.getMessage());
            System.out.println("Exception string: " + e.toString());
            e.printStackTrace();
        }
        finally {
            System.out.println("--------------");
            System.out.println("finally");
        }
        System.out.println("No exception?");
    }

    public static void main(String[] args) {
        new TryTest();
    }
}
