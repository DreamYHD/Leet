package javaPack.threadTest.reentrantlock;

import javaPack.threadTest.couser.Course;
import javaPack.threadTest.couser.ThreadB;

/**
 * Created by Administrator on 2019/3/12.
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.say();
    }
}
