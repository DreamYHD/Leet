package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/13.
 */
//输入两棵二叉树A和B，判断B是不是A的子树
    //我们可以分成两步，第一步判断根节点在不在A里面，第二部
public class Day4to14 {

    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

    }

    /**
     * 判断在A中有没有B的根节点
     * @param root1
     * @param root2
     * @return
     */
    public static boolean hasSubtree(BinaryTreeNode root1,BinaryTreeNode root2){
        if (root1 == root2) {
            return true;
        }
        if (root2 == null){
            return true;

        }
        if (root1 == null){
            return false;
        }

        boolean result = false;
        if (root1.value == root2.value){
            result = match(root1,root2);
        }
        if (result) {
            return true;
        }
        return hasSubtree(root1.left,root2)||hasSubtree(root1.left,root2);
    }

    /**
     * 在B存在A中根节点的情况下
     * @param root1
     * @param root2
     * @return
     */
    public static boolean match(BinaryTreeNode root1,BinaryTreeNode root2){
        if (root1 == root2) {
            return true;
        }
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.value == root2.value){
            return match(root1.left,root2.left)&&match(root1.right,root2.right);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
