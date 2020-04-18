package Java8.future;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author zhouchuang
 * @create 2020-04-18 21:23
 */
public class FutureTaskTest {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        Instant start = Instant.now();
        FutureTask<Integer> future  = new FutureTask<Integer>(()->{
            Thread.sleep(3000);
            return 10;
        });
        executorService.submit(future);
        System.out.println("主线程调用子线程后："+(Duration.between(start, Instant.now()).toMillis()));
        System.out.println(future.get());
        System.out.println("获取子线程结果后："+(Duration.between(start, Instant.now()).toMillis()));
        executorService.shutdown();

    }
}
