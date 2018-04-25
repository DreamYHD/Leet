package javaPack.pc;

/**
 * Created by Administrator on 2018/4/16.
 */
public class ProThread extends Thread {
    private Product p;
    public ProThread(Product p){
        super();
        this.p = p;
    }
    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
