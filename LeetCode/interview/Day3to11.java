package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/12.
 */
//输入一个链表，输出该链表的倒数第k个节点
//我们可以定义两个指针。一个指向第k-1个节点，一个指向开始，然后同时开始向后面进行遍历，当最后的节点到达了末尾位置的时候倒数第二个节点就在最后的位置了
public class Day3to11 {
    public static class ListNode{
        int value;
        ListNode next;
    }
    public static ListNode printBack(ListNode node,int k){
        ListNode start = node;
        ListNode back = node;
        if ( node == null|| k < 1 ){
            return null;
        }
        for (int i = 1; i < k ; i++) {
            if (node.next == null){
                return null;
            }else {
                back = back.next;
            }
        }
        while (back.next != null){
            start = start.next;
            back = back.next;
        }

        return start;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.value = 1;
        ListNode node1 = new ListNode();
        node1.value = 2;
        node.next = node1;
        ListNode node2 = new ListNode();
        node2.value = 3;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.value = 4;
        node2.next = node3;
        ListNode node4 = new ListNode();
        node4.value = 5;
        node3.next = node4;
        ListNode node5 = new ListNode();
        node4.next = node5;
        node5.value = 6;
        node5.next = null;
        for (int i = 1; i <= 6 ; i++) {
            System.out.println(printBack(node,i).value);;
        }




    }


}
