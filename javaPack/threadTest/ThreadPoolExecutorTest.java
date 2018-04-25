package javaPack.threadTest;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/4/13.
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(
                5,
                10,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>()
               );
        //无法判定线程是否被执行成功
        executor.execute(()->
                System.out.println("exector 方式")
        );
        //可以判断是否执行成功，future的get方法会一直阻塞到线程执行完成之后；
        //方法1
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 2;
        });
        try {
            if (future.get() == 2) {
                System.out.println("线程执行成功");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        //方法2
        Future<String>future1 = executor.submit(() -> {
            throw new NullPointerException();
        },"hello");
        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
