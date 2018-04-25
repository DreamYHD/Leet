package javaPack.threadTest;

/**
 * Created by Administrator on 2018/4/13.
 */
public class RunnableTest implements Runnable {
    synchronized void  test(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" " + i );
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        test();
    }
    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        Thread thread1 = new Thread(runnableTest);
        Thread thread2 = new Thread(runnableTest);
        thread.start();
        thread1.start();
        thread2.start();

    }
}
