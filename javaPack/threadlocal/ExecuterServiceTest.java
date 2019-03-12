package javaPack.threadlocal;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2019/3/12.
 */
public class ExecuterServiceTest implements Callable<Integer> {
    public static void main(String[] args) {
        FutureTask<Integer>futureTask = new FutureTask<Integer>(new ExecuterServiceTest());
        try {
            futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        ExecutorService  service = new ThreadPoolExecutor(5,
                5,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());
        ExecutorService service1 = Executors.newFixedThreadPool(5);
        ExecutorService service2 = Executors.newCachedThreadPool();
        ScheduledExecutorService service3 = Executors.newScheduledThreadPool(4);
        ExecutorService service4 = Executors.newSingleThreadExecutor();
        service4.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        });
        service3.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟");
            }
        },3,TimeUnit.SECONDS);
        service3.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

            }
        },3,2,TimeUnit.SECONDS);
        Future<Integer>future = service.submit(new ExecuterServiceTest());
        try {
            System.out.println(future.get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        return 3;
    }
}
