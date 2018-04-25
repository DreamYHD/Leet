package javaPack.pc;

/**
 * Created by Administrator on 2018/4/16.
 */
public class ConThread extends Thread {
    private Consumer consumer;

    public ConThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.getValue();
        }
    }
}
