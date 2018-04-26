package datastruct;

import org.jetbrains.annotations.Contract;

import javax.xml.soap.Node;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/19.
 */
public class Double<T> {
    //全局锁
    private final ReentrantLock reentrantLock = new ReentrantLock();
    //插入锁
    private final Condition notEmpty = reentrantLock.newCondition();
    //获取锁
    private final Condition notFull = reentrantLock.newCondition();
    private class DNode<T>{
        DNode<T> prev;
        DNode<T> next;
        T value;
        DNode(DNode prev, DNode next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
    //定义表头
    private DNode<T> mHead;
    //节点个数
    private volatile int mCount;

    public Double(){
        mHead = new DNode<>(null,null,null);
        mHead.prev = mHead.next = mHead;
        mCount = 0;
    }
    public  int getCount(){
        return mCount;
    }
    //返回链表是否为空
    public boolean isEmpty(){
        reentrantLock.tryLock();
        boolean is = false;
        if (mCount == 0) {
            is = true;
        }
        reentrantLock.unlock();
        return is;
    }
    //获取index位置的节点
    public DNode<T>getNode(int index) throws InterruptedException {
        reentrantLock.lockInterruptibly();
        try {
            if (index < 0 || index >= mCount)
                notEmpty.wait();
            //正向查找
            if (index <= mCount/2) {
                DNode<T>node = mHead.next;
                for (int i = 0; i < index ; i++) {
                    node = node.next;
                }
                return node;
            }
            //反向查找
            DNode<T>rnode = mHead.prev;
            int rindex = mCount - index - 1;
            for (int i = 0; i < rindex; i++) {
                rnode = rnode.prev;
            }
            return rnode;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
        return null;
    }
    @Contract("null -> fail")
    public static void checkNotNull(Object tdNode){
        if (tdNode == null) {
            throw new NullPointerException();
        }
    }
    public DNode<T> getFirstNode() throws InterruptedException {
        return getNode(0);
    }
    public DNode<T>getLastNode() throws InterruptedException {
        return getNode(mCount-1);
    }
    public void insert(int index,T t){
        if (index == 0) {
            DNode<T>node = new DNode<>(null,mHead.next,t);
            mHead.prev = node;
            mHead.next = node;
            mCount ++;
            return;
        }
    }










}
