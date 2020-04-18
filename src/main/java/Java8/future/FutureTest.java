package Java8.future;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhouchuang
 * @create 2020-04-18 21:02
 */
public class FutureTest {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        Instant start = Instant.now();
        Future<Integer> future  =  executorService.submit(()->{
            Thread.sleep(3000);
            return 10;
        });
        System.out.println("主线程调用子线程后："+(Duration.between(start, Instant.now()).toMillis()));
        System.out.println(future.get());
        System.out.println("获取子线程结果后："+(Duration.between(start, Instant.now()).toMillis()));
        executorService.shutdown();

    }
}
