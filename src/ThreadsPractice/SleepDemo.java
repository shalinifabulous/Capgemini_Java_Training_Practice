package ThreadsPractice;

public class SleepDemo extends Thread{
    public void run(){
        for (int i = 1; i < 3; i++) {
            System.out.println("Running" + i);

            try{
                Thread.sleep(1000); //stops execution of thread for certain time mentioned as argument. Static method
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepDemo sleepDemo = new SleepDemo();
        sleepDemo.start();
    }
}
