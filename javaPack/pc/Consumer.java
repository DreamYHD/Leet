package javaPack.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/16.
 */

/**
 * 消费者
 */
public class Consumer {
    private ReentrantLock reentrantLock;
    private Condition condition;

    public Consumer(ReentrantLock reentrantLock, Condition condition) {
        this.reentrantLock = reentrantLock;
        this.condition = condition;
    }
    public void getValue(){
        try {
            reentrantLock.lock();
            while (StringObject.value.equals("")){
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"get value = "+StringObject.value);
            StringObject.value = "";
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }

    }
}
