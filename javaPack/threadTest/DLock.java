package javaPack.threadTest;

/**
 * Created by Administrator on 2018/4/14.
 */
public class DLock {
    Object A = new Object();
    Object B = new Object();
    public void a(){
        synchronized (A){
            synchronized (B){
                System.out.println("success a");
            }
        }
    }
    public void b(){
        synchronized (A){
            synchronized (B){
                System.out.println("success b");
            }
        }
    }




}
