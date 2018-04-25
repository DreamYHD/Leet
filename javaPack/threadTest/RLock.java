package javaPack.threadTest;

/**
 * Created by Administrator on 2018/4/14.
 */
public class RLock {
    private Object object = new Object();
    public void transefMoney( Object accountA, Object accountB) {
        class Helper{
            public void transfer(){
                //代码块
                System.out.println("success");
            }
        }
        int fromA = System.identityHashCode(accountA);
        int fromB = System.identityHashCode(accountB);
        if (fromA < fromB ){
            synchronized (accountA){
                synchronized (accountB){
                    new Helper().transfer();
                }
            }
        }else if (fromA > fromB){
            synchronized (accountB){
                synchronized (accountA){
                    new Helper().transfer();
                }
            }
        }else {
            synchronized (object){
                synchronized (accountA){
                    synchronized (accountB){
                        new Helper().transfer();
                    }
                }
            }
        }
    }
}
