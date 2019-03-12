package javaPack.threadTest.couser;

/**
 * Created by Administrator on 2019/3/12.
 */
public class Product {
    private MyStack m;
    public Product(MyStack m){
        this.m = m;
    }
    public void pushService(){
        m.push();
    }
}
