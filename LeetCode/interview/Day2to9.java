package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/10.
 */
//给定单向链表的一个头结点和指针节点，定义一个函数在、o1时间删除该节点
//由于已经定义了给定的指针节点，只要把该节点的值替换为下一个指针的值，指针直接指向下一个节点的下一个节点
public class Day2to9 {
     public static class ListNode{
         int value;
         ListNode next;
     }
     public static ListNode deleteNode(ListNode head,ListNode delete){
         if (head == null || delete == null){
             return head;
         }
         if (head == delete) {
             head.value = head.next.value;
             head = head.next;
             return head;
         }
         if (delete.next == null){
             ListNode node = head;
             while (node.next != delete){
                 node = node.next;
             }
             node.next = null;
         }else {
             delete.value = delete.next.value;
             delete.next = delete.next.next;
         }
         return head;


     }
    public static void main(String[] args) {



    }


}
