package Day3.Exercise34;

import java.util.Random;

public class MyThread extends Thread{
    @Override
    public void run(){
        int counter = 0;

        System.out.println("bingo: " + Thread.currentThread().getName());
        int sleepTime = new Random().nextInt(5000);
        System.out.println("Sleep time: " + sleepTime + " for " + Thread.currentThread().getName());
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println(counter++);
                //System.console().flush();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //System.out.println("Thread " + Thread.currentThread().getName() + " woke up after " + sleepTime / 1000 + " seconds.");
    }
}
