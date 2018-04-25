package javaPack.threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2018/4/13.
 */
public class CallableTest implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 5 ; i ++){
            System.out.println(Thread.currentThread().getName()+" "+ i);

        }
        return i;
    }
    public static void main(String[] args) {
     CallableTest callableTest = new CallableTest();
     FutureTask<Integer> futureTask = new FutureTask<Integer>(callableTest);
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 2) {
                new Thread(futureTask,"futureTask").start();
            }
        }

        try {
            System.out.println("子线程的返回值"+ futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
