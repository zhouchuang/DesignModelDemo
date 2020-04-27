package Demo.abstractQueuedSynchronizer;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class MyReentrantLock implements Lock {


    AtomicInteger count = new AtomicInteger(0);
    AtomicReference<Thread> owner = new AtomicReference<>();
    private LinkedBlockingQueue<Thread> waiters = new LinkedBlockingQueue<>();
    @Override
    public void lock() {
        if(!tryLock()){ //没有抢到锁，则放入到队列后
            waiters.offer(Thread.currentThread());
            //自旋
            for(;;){
                Thread head = waiters.peek();
                if(head==Thread.currentThread()){
                    if(!tryLock()){
                        //没抢到锁，还是挂起
                        LockSupport.park();
                    }else{
                        waiters.poll();
                        return ;
                    }
                }else{
                    //不是第一个，再挂起
                    LockSupport.park();
                }
            }
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        int ct = count.get();
        if(ct!=0){ //占用了
            if(owner.get()==Thread.currentThread()){
                count.set(ct+1);
                return true;
            }else{
                return false;
            }
        }else{
            //没有占用锁
            if(count.compareAndSet(0,1)){
                owner.set(Thread.currentThread());
                return true;
            }else{
                return false;
            }
        }
    }

    public boolean tryUnlock(){
        //判断，是否是当前线程占有锁，若不是，抛异常
        if(owner.get()!=Thread.currentThread()){
            throw new IllegalMonitorStateException();
        }else{
            int ct = count.get();
            ct = ct-1;
            count.set(ct);
            //如果是0了，则该锁没有线程了
            if(ct==0){
                owner.compareAndSet(Thread.currentThread(),null);
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        if(tryUnlock()){
            Thread th = waiters.peek();
            if(th!=null){
                LockSupport.unpark(th);
            }
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
