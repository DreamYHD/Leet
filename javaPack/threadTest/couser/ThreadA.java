package javaPack.threadTest.couser;

/**
 * Created by Administrator on 2019/3/12.
 */
public class ThreadA  extends Thread{
    private Product product;

    public ThreadA(Product product) {
        this.product = product;
    }
    @Override
    public void run() {
        while (true){
            product.pushService();
        }
    }
}
