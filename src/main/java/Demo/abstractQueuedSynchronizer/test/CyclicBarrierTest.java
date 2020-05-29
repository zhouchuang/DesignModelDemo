package Demo.abstractQueuedSynchronizer.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest  {
    static Integer count = 0;
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(20,()->{
            if(count==0){
                System.out.println("班车开始运营");
            }else{
                System.out.println("车上座位已经满，请等待下一班！");
            }
            count++;
        });
        for(int i=0;i<100;i++){
            new Thread(()->{
                try {
                    Thread.sleep((long)(Math.random()*1000));
                    barrier.await();
                    System.out.println(Thread.currentThread().getName()+"赶上了"+count+"第趟车");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
