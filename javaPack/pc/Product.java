package javaPack.pc;

/**
 * Created by Administrator on 2018/4/16.
 */


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者
 */
public class Product{
    private Condition condition;
    private ReentrantLock reentrantLock;

    public Product(ReentrantLock reentrantLock,Condition condition) {
        super();
        this.condition = condition;
        this.reentrantLock = reentrantLock;
    }
    public void setValue(){
            try {
                reentrantLock.lock();
                while (!StringObject.value.equals("")){
                    condition.await();
                }
                String value = System.currentTimeMillis()+""+System.nanoTime();
                System.out.println(Thread.currentThread().getName()+"set value = "+value);
                StringObject.value = value;
                condition.signalAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
    }
}
