package javaPack.threadTest.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2019/3/12.
 */
public class MyService {
    private ReentrantLock reentrantLock = new ReentrantLock();
    private Condition condition = reentrantLock.newCondition();//可以通过不同的condition唤起指定的线程
    private Condition condition2 = reentrantLock.newCondition();//可以通过不同的condition唤起指定的线程


    public void say() {
        try {
            reentrantLock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
            System.out.println("say 释放了");
        }
    }
    public void look(){
        try {
            reentrantLock.lock();
            System.out.println("C");
            condition2.signal();
            System.out.println("D");
        } finally {
            System.out.println("look 释放了");
            reentrantLock.unlock();

        }

    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        threadB.start();
    }


}
