import java.io.*;

/*
=====================================================
Day 33 - Synchronization + File Handling
=====================================================
*/

class Counter {

    int count = 0;

    synchronized void increment(){

        count++;
    }
}

class Worker extends Thread{

    Counter counter;

    Worker(Counter counter){
        this.counter = counter;
    }

    public void run(){

        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}

public class Day33_Synchronization_FileHandling {

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        Worker t1 = new Worker(counter);
        Worker t2 = new Worker(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);


        /*
        File Writing
        */

        FileWriter writer =
                new FileWriter("practice.txt");

        writer.write("Java File Handling Practice");

        writer.close();


        /*
        File Reading
        */

        BufferedReader reader =
                new BufferedReader(new FileReader("practice.txt"));

        String line;

        while((line = reader.readLine()) != null){

            System.out.println(line);
        }

        reader.close();
    }
}
