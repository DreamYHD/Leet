package javaPack.threadTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/15.
 */
public class XLock {
    ReentrantLock lock = new ReentrantLock(true);
    void test(){
        lock.lock();//如果被其他锁自愿锁定，会在这里等待锁释放，达到暂停的效果
        try {
            test1();
        }finally {
            lock.unlock();//释放锁
        }

    }
    void test1(){
        lock.lock();
        try {
            System.out.println("hello test1");
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        new XLock().test1();
    }
}
