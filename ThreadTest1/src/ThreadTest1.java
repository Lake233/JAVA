public class ThreadTest1 {
    public ThreadTest1(){
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        first.start();
        second.start();
    }

    public static void main(String[] args) {
        new ThreadTest1();
    }
}
class FirstThread extends Thread{
    public void run(){
        try {
            System.out.println("First thread starts running.");
            for (int i = 0; i < 10; i++){
                System.out.println("First" + i);
                sleep(1000);
            }
            System.out.println("Firat thread finishes running.");
        }catch (InterruptedException e){}
    }
}
class SecondThread extends Thread{
    public void run(){
        try {
            System.out.println("\tSecond thread starts running.");
            for (int i = 0; i < 10; i++){
                System.out.println("\tSecond" + i);
                sleep(1000);
            }
            System.out.println("\tSecond thread finishes running.");
        }catch (InterruptedException e){}
    }
}