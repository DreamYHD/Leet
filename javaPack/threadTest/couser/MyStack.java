package javaPack.threadTest.couser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/3/12.
 */
public class MyStack {
    private List<String> list = new ArrayList<>();
    //入栈，只有在0
    synchronized public void push(){
        while (list.size() == 1){
            try {
                this.wait();
                System.out.println("生产者线程在等待ing"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add("test"+Math.random());
        this.notifyAll();
        System.out.println("push "+list.size());
    }
    //出栈，只有在1
    synchronized public void pop(){
        while (list.size() == 0){
            try {
                this.wait();
                System.out.println("消费者线程在等待ing"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.remove(0);
        this.notifyAll();
        System.out.println("pop"+list.size());
    }

}
