package Java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadLocal  {
    //使用ThreadLocal代替原来的new SimpleDateFormat
    private static final ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("new object");
            return  new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    private static  final SimpleDateFormat singleSimple = new SimpleDateFormat("yyyy-MM-dd");

    public String today() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormatter.get().format(new Date());
    }

    public static void main(String[] args) {
        TestAbstract  p  = new TestAbstract(){
            @Override
            public String get(){
               return "test";
            }
        };
        p.print();


        ExecutorService executor  = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; i++) {
            MyTask task = new MyTask();
            executor.execute(task);
        }
        executor.shutdown();
    }
    static class MyTask implements Runnable {

        //当直接使用SimpleDateFormat时候，则可能回报错，因为不是线程安全的，多个线程会竞争这个资源
        public void run() {
            try {
                System.out.println(dateFormatter.get().format(new Date()));
                System.out.println(Addresser.addressOf(dateFormatter));//可以看出 使用Threadlocal获取的不是同一个内存地址，则不是同一个对象
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
