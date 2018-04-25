package javaPack.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/16.
 */
public class Client {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();

        for (int i = 0; i < 3 ; i++) {
            ConThread conThread = new ConThread(new Consumer(reentrantLock,condition));
            ProThread proThread = new ProThread(new Product(reentrantLock,condition));

            conThread.start();
            proThread.start();
        }
    }
}
