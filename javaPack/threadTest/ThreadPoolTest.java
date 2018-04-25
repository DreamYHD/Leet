package javaPack.threadTest;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/4/14.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //线程池的一般使用
        ExecutorService executorService = new ThreadPoolExecutor(
                5,//核心线程数
                10,//最大线程数
                10, //非核心线程的闲置超时时长
                TimeUnit.SECONDS, //时间单位
                new LinkedBlockingQueue<>());//放置线程的队列
        //没有返回值的提交方式
        executorService.execute(
                () -> System.out.println("this is execute ")
        );
        //有返回值的提交方式，我们可以通过这个返回值来判断任务是否执行成功
        Future<Integer>integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        try {
            int m = integerFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Future<String>integerFuture1 = executorService.submit(
                () -> System.out.println("do submit by runnable"),
                "success"
        );
        try {
            if (integerFuture.get() == 2) {
                System.out.println("success do submit by callable");
            }
            if (integerFuture1.get().equals("success")){
                System.out.println("success do submit by runnable");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        //结束线程池中的所有任务不管有没有执行完成
        executorService.shutdownNow();
        //线程池的工作流程
        //1 提交任务后，如果线程池中的线程数量没有达到核心线程的数量，开启一个核心线程来执行任务‘
        //2 如果达到了核心线程的数量，把当前任务放到任务队列中等待核心线程
        //3 如果任务队列已经满了，无法将任务插入到任务队列中，则开启一个非核心线程去执行任务
        //4 如果核心线程的数量已经满了，并且达到了最大线程数，那么就会拒绝执行这个任务，这个时候就会调用，RejectedExecutionHandle中的rejectedExecution方法来通知调用者


        //四种线程池类
        //newFixedThreadPool
        //核心线程数目等于最大线程数目，意味着可以和很快的执行任务，并且使用Linked作为线程队列，大小也不受限制，所有的活跃线程也不会被回收，除非线程池关闭。并且不存在超时限制
        ExecutorService fixPool = Executors.newFixedThreadPool(4);
//        public static ExecutorService newFixedThreadPool(int nThreads) {
//            return new ThreadPoolExecutor(nThreads, nThreads,
//                    0L, TimeUnit.MILLISECONDS,
//                    new LinkedBlockingQueue<Runnable>());
//        }
        //newCachedThreadPool
        //我们可以看出核心线程数为0，最大线程数为Integer.MaxValue,现有的线程无法执行新任务，直接创建新的线程去执行，不会去等待，当线程超过60s闲置就会回收，因为是使用SynchronousQueue内部相当于一个空集合
        ExecutorService cachePool = Executors.newCachedThreadPool();
//        public static ExecutorService newCachedThreadPool() {
//            return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                    60L, TimeUnit.SECONDS,
//                    new SynchronousQueue<Runnable>());
//        }
        //newScheduledThreadPool
        ScheduledExecutorService schedulePool = Executors.newScheduledThreadPool(4);
        schedulePool.schedule(() -> System.out.println("延迟三秒之后执行任务"),3,TimeUnit.SECONDS);
        //上一个执行到下一个开始执行消耗的时间，周期性的执行任务
        schedulePool.scheduleAtFixedRate(() -> {
            System.out.println("延迟三秒之后每隔两秒执行一次");
        }, 3, 2, TimeUnit.SECONDS);
        //只有一个核心线程，等待队列无线大，这个时候不需要处理线程同步问题，一个线程处于活跃的时候，其余线程处于等待队列中
        schedulePool.scheduleWithFixedDelay(()-> System.out.println("延迟三秒后每隔两秒执行一次，等上一个执行完"),3,2,TimeUnit.SECONDS);
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
//        public static ExecutorService newSingleThreadExecutor() {
//            return new Executors.FinalizableDelegatedExecutorService
//                    (new ThreadPoolExecutor(1, 1,
//                            0L, TimeUnit.MILLISECONDS,
//                            new LinkedBlockingQueue<Runnable>()));
//        }
    }
}
