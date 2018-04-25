package javaPack.threadTest;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/4/18.
 */
public class BlockingQueueTest {
    public static void main(String[] args) {

        //设置容量和是否为公平锁
        BlockingQueue<String>blockingQueue = new ArrayBlockingQueue<String>(10,true);
        //blockingQueue.remove();//抛出异常
        if (blockingQueue.poll() == null) {//获取队列的头部元素，获取队列头部的元素并且删除，不会抛出异常
            System.out.println("还没有数据");
        }
        if (blockingQueue.peek() == null) {//获取队列的头部元素，并且不会删除
            System.out.println("还没有数据");
        }
        for (int i = 0; i < 10 ; i++) {
            blockingQueue.add("test"+i);
        }
        String s;
        if ((s = blockingQueue.remove())!=null){
            System.out.println(s);
        }
        System.out.println(blockingQueue.element());//获取队列的第一个元素
        // blockingQueue.add("hello");//直接抛出异常
        if (blockingQueue.offer("hello")) {//插入一条元素，如果队列为空的话直接返回false
            for (String s1 : blockingQueue ){
                System.out.println(s1);
            }
            System.out.println("还可以添加");
        }else {
            System.out.println("队列已经满了");
        }
    }

}
