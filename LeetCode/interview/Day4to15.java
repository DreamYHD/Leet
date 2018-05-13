package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/13.
 */

/**
 * 输出一个二叉树的镜像
 * 使用先序遍历一颗二叉树
 */
public class Day4to15 {
    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }
    public static void mirror(BinaryTreeNode node){
        if (node != null) {
            BinaryTreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        mirror(node.left);
        mirror(node.right);
    }
}
