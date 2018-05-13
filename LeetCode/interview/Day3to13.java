package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/12.
 */
//合并两个顺序链表，保证合并之后还是按照顺序的
public class Day3to13 {


    public static class ListNode{
        int value;
        ListNode next;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        if (head1 == null) {
           return head2;
        }
        if (head2 == null) {
            return  head1;
        }
        ListNode newNode = new ListNode();
        ListNode pointer = new ListNode();
        newNode = pointer;
        while (head1 != null && head2 != null){
            if (head1.value < head2.value){
                pointer.next = head1;
                head1 = head1.next;
            }else {
                pointer.next = head2;
                head2 = head2.next;
            }
            pointer = pointer.next;

        }
        if (head1 == null){
            pointer.next = head2;
        }
        if (head2 == null) {
            pointer.next = head1;
        }
        return newNode.next;



    }
    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.value = 9;
        ListNode node1 = new ListNode();
        node1.value = 10;
        node.next = node1;
        ListNode node2 = new ListNode();
        node2.value = 13;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.value = 14;
        node2.next = node3;
        ListNode node4 = new ListNode();
        node4.value = 15;
        node3.next = node4;
        ListNode node5 = new ListNode();
        node4.next = node5;
        node5.value = 26;

        ListNode node6 = new ListNode();
        node6.value = 6;
        ListNode node7 = new ListNode();
        node7.value = 12;
        node6.next = node7;
        ListNode node8 = new ListNode();
        node8.value = 13;
        node7.next = node8;
        ListNode node9 = new ListNode();
        node9.value = 14;
        node8.next = node9;
        ListNode node10 = new ListNode();
        node10.value = 15;
        node9.next = node10;
        ListNode node11 = new ListNode();
        node11.value = 16;
        node10.next = node11;
        System.out.println(merge(node,node6).value);
    }
}
