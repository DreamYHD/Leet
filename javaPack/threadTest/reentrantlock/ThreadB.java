package javaPack.threadTest.reentrantlock;

/**
 * Created by Administrator on 2019/3/12.
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
     myService.look();
    }
}
