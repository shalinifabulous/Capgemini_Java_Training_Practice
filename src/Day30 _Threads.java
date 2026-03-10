/*
=====================================================
Day 30 - Threads Practice
Topics:
Thread creation
Thread lifecycle
Sleep
Priority
Yield
=====================================================
*/

class MyThread extends Thread {

    public void run(){

        for(int i=1;i<=5;i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);

            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class Day30_Threads {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        Thread.yield();
    }
}
