package Demo.abstractQueuedSynchronizer.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void executeCondition1() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " executeCondition1 start");
            condition1.await();
            System.out.println(Thread.currentThread().getName() + " executeCondition1 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void executeCondition2() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " executeCondition2 start");
            condition2.await();
            System.out.println(Thread.currentThread().getName() + " executeCondition2 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void executeSignal1() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " executeSignal1 start");
        condition1.signalAll();
        condition2.signalAll();
        System.out.println(Thread.currentThread().getName() + " executeSignal1 end");
        lock.unlock();
    }

    public void executeSignal2() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " executeSignal2 start");
        condition2.signalAll();
        System.out.println(Thread.currentThread().getName() + " executeSignal2 end");
        lock.unlock();
    }
}

class MyTest {

    public static void main(String[] args) {
        final ReentrantLockTest myTask = new ReentrantLockTest();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.executeCondition1();
            }
        });
        t1.setName("t1");

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.executeCondition2();
            }
        });
        t2.setName("t2");


        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.executeCondition2();
            }
        });
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTask.executeSignal1();
    }
}
