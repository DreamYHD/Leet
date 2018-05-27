package LeetCode.interview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/5/17.
 */
//从上往下打印二叉树的每个节点，同意层的节点按照从右往左打印
public class Day5to19 {
    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }
    public static void printAll(BinaryTreeNode root){
        if (root == null){
            throw new NullPointerException("null pointer");
        }
        Queue<BinaryTreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTreeNode node = queue.remove();
            System.out.println(node.value);
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }
    public static void main(String[] args) {


    }
}
