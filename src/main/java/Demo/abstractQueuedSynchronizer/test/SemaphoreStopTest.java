package Demo.abstractQueuedSynchronizer.test;

import java.util.concurrent.Semaphore;

public class SemaphoreStopTest {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(10);
        while(true){
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"进入停车场，占用一个停车位");
                    Thread.sleep(1000+(long)Math.random()*10000);
                    System.out.println(Thread.currentThread().getName()+"离开停车场,空出一个停车位");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
