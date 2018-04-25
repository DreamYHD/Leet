package javaPack.threadTest;

/**
 * Created by Administrator on 2018/4/13.
 */
public class FirstThreadTest extends Thread {
    int i = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if ( i == 2){
                new FirstThreadTest().start();
                new FirstThreadTest().start();

            }
        }
    }
    @Override
    public void run() {
        for (; i <5 ; i++) {
            System.out.println(getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
