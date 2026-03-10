package ThreadsPractice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        Thread t1 = new Thread(myThread1);
        t1.start();

        myThread.setName("Shalini");
        System.out.println(myThread.getName());

        myThread.setPriority(10);
        System.out.println(myThread.getPriority());

       // myThread.run();
        myThread.start();

        myThread.join();//stops the execution of current method and allows next thread to execute
        System.out.println("main");
    }
}
