package LeetCode.interview;

import java.util.Stack;

/**
 * Created by Administrator on 2018/5/17.
 */
//栈的压入传出序列,第一个序列表示栈的压入顺序，请判断二哥序列是否为该栈的弹出序列。假设压入栈的所有数字均不相等
//解题思路，建立一个辅助栈，把第一个序列中的所有数字一次压入该栈，并且按照
public class Day5to18 {
    public static boolean isPop(int []data1,int []data2){
        Stack<Integer>stack = new Stack<>();
        for (int i = 0,j = 0; i <data1.length ; i++) {
            stack.push(data1[i]);
            while (stack.size() > 0 && stack.peek() == data2[j]){
                stack.pop();
                j ++;
            }
        }
        return stack.size() == 0;
    }
    public static void main(String[] args) {



    }
}
