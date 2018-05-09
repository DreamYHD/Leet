package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/9.
 */

import java.util.Stack;

/**
 * 输入一个链表的头结点，从尾到头打印出来每个节点
 * 使用栈的方式进行，将链表从头到尾压如栈内，出栈的时候就对应着从尾到头,这里只是打印，不是翻转
 */
public class Day1to1 {
    /**
     * 节点对象
     */
    public static class ListNode{
        int val;//节点的值
        ListNode next;//下一个节点的位置
    }
    public static void printListInverselyUsingIteration(ListNode root){
        Stack<ListNode>stack = new Stack<>();
        while (root != null){
            stack.push(root);
            root = root.next;
        }
        ListNode tmp;
        while (!stack.isEmpty()){
            tmp = stack.pop();
            System.out.println(tmp.val+" ");
        }
    }
    public static void main(String[] args) {

    }
}
