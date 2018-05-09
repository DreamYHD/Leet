package LeetCode.interview;

import java.util.Stack;

/**
 * Created by Administrator on 2018/5/9.
 */
//用两个栈实现队列，请事先它的两个函数添加和删除
    //一个栈用于插入，一个用于删除 1,2,3->3,2,1->1,2,3
public class Day1to4 {
    public static class MList<T>{
        //插入栈
        private Stack<T>stackInsert = new Stack<>();
        //删除栈
        private Stack<T>stackDelete = new Stack<>();
        public void appendTail(T t){
            stackInsert.add(t);
        }
        public T deleteHead(){
            if (stackDelete.empty()){
                while (!stackInsert.empty()){
                    stackInsert.push(stackInsert.pop());
                }
            }
            //
            if (!stackDelete.empty()){
            throw new RuntimeException("no more data");
            }
            return stackDelete.pop();
        }
    }
    public static void main(String[] args) {

    }
}
