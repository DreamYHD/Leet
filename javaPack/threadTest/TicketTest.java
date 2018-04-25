package javaPack.threadTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/15.
 */
public class TicketTest implements Runnable {
    int num = 20;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.lock();
            if (num > 0){
                System.out.println("剩余票数 :"+Thread.currentThread()+"  "+ num--);
            }
            lock.unlock();


        }
    }

    public static void main(String[] args) {
        TicketTest ticketTest = new TicketTest();
        Thread thread1 = new Thread(ticketTest);
        Thread thread2 = new Thread(ticketTest);
        Thread thread3 = new Thread(ticketTest);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
