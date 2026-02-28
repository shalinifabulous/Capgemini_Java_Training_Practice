class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class Day19_MultiThreading {

    public static void main(String[] args) {

        System.out.println("Day 19: Multithreading Practice");

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println("Main thread ends");

        System.out.println("Day 19 Practice Completed");
    }
}