package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/12.
 */
//翻转链表,输入头结点翻转之后输出头结点
public class Day3to12 {
    public static class ListNode{
        int value;
        ListNode next;
    }

    /**
     * 借助 头节点左边的空为辅助
     * @param head
     * @return
     */
    public static ListNode reverseHead(ListNode head){
        if (head == null){
            throw new NullPointerException();
        }
        ListNode left = null;
        ListNode right = head;
        while (right != null){
            //使用head只是为了不去开辟新的空间随便一个都可以替换的，用这个节点来保护下一个
            head = right.next;
            //下一个已经被保护了就设置新的,同时也是翻转的关键一步
            right.next = left;
            //翻转完成了，重新赋值，方便下一次你翻转
            left = right;
            right = head;
        }
        return left;
    }
    public static ListNode reserveHead2(ListNode head){
        if (head == null)throw new NullPointerException();
        ListNode left = null;
        ListNode right = head;
        while (right != null){
            head = right.next;
            right.next = left;
            left = right;
            right = head;
        }
        return left;
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
        System.out.println(reverseHead(node).value);



    }
}
