package LeetCode.interview;

import java.util.Stack;

/**
 * Created by Administrator on 2018/5/17.
 */
//包含min函数的栈,定义栈的数据结构，请在该类型中实现一个能够得到栈的最小数的函数，在该栈中，调用min，铺设，pop的时间复杂度都是O1
public class Day5to17 {
    private static Stack<Integer>stack = new Stack<>();
    private static Stack<Integer>minStack = new Stack<>();
    public static void push(int data){
        stack.push(data);
        if (minStack.size() == 0 || data <= minStack.peek()) {
            minStack.push(data);
        }
    }
    public static void pop(){
        if (stack.size() == 0) {
            throw new RuntimeException("null data");
        }
        if (stack.peek() == minStack.peek()) {
            stack.pop();
            minStack.pop();
        }else {
            stack.pop();
        }
    }
    public static int min(){
        if (minStack.size() == 0) {
            throw new RuntimeException();
        }
        return minStack.peek();

    }
    public static void main(String[] args) {
        Day5to17.push(3);
        Day5to17.push(4);
        Day5to17.push(8);
        Day5to17.push(2);
        Day5to17.push(7);
        Day5to17.push(1);
        System.out.println(min());
        pop();
        System.out.println(min());





    }
}
