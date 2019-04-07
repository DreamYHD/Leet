package LeetCode;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2019/3/30.
 */
public class Main2 {

     static class ThreeNode{
        int value;
        ThreeNode left;
        ThreeNode right;
    }
    public static boolean numberOfOne(ThreeNode  threeNode) {
        long currentVal = Long.MIN_VALUE;
        LinkedList<ThreeNode>stack = new LinkedList();
        while (threeNode!=null||!stack.isEmpty()){
            while (threeNode!=null){
                stack.push(threeNode);
                threeNode = threeNode.left;
            }
            threeNode = (ThreeNode) stack.pop();
             if (threeNode.value<=currentVal){
                 return false;
             }
             currentVal = threeNode.value;
             threeNode = threeNode.right;
        }
        return true;
    }
//10,5,15,3,7,13,18
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         List<Integer>list = new ArrayList<>();
         String[] a = scanner.nextLine().split(",");

         ThreeNode node1 = new ThreeNode();
         node1.value = new Integer(a[0]);
        ThreeNode node2 = new ThreeNode();
        node2.value = new Integer(a[1]);
        ThreeNode node3 = new ThreeNode();
        node3.value = new Integer(a[2]);
        ThreeNode node4 = new ThreeNode();
        node4.value = new Integer(a[3]);
        ThreeNode node5 = new ThreeNode();
        node5.value = new Integer(a[4]);
        ThreeNode node6 = new ThreeNode();
        node6.value = new Integer(a[5]);
        ThreeNode node7 = new ThreeNode();
        node7.value = new Integer(a[6]);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = null;
        node4.right = null;
        node5.left = null;
        node5.right = null;
        node6.left = null;
        node6.right = null;
        node7.left = null;
        node7.right = null;
        System.out.println(numberOfOne(node1));


    }

}
