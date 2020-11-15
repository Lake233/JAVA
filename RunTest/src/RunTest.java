public class RunTest {
    public RunTest(){
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        new RunTest();
    }
}
class FirstThread implements Runnable{
    public void run(){
        try {
            System.out.println("First thread starts running.");
            for (int i = 0; i < 6; i++){
                System.out.println("First" + i);
                Thread.sleep(1000);
            }
            System.out.println("First thread finishes running.");
        }catch (InterruptedException e){}
    }
}
class SecondThread implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("\tSecond thread starts running.");
            for (int i = 0; i < 6; i++){
                System.out.println("\tSecond" + i);
                Thread.sleep(1000);
            }
            System.out.println("\tSeocnd thread finishes running.");
        }catch (InterruptedException e){}
    }
}