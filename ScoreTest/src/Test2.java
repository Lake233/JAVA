import java.util.Arrays;

interface Ia{
    int max(int []a);
}
interface Ib{
    int min(int []a);
}
public class Test2 implements Ia,Ib {
    @Override
    public int max(int[] a) {
        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public int min(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static void main(String[] args) {
        int[] a = new int[]{88, 89, 82, 90, 98};
        Test2 test2 = new Test2();
        System.out.println(test2.max(a));
        System.out.println(test2.min(a));
    }
}
