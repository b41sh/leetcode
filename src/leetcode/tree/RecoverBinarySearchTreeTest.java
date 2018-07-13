package leetcode.tree.recoverBinarySearchTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 99. Recover Binary Search Tree
 */
public class RecoverBinarySearchTreeTest {

    @Test
    public void test() {

        System.out.println("RecoverBinarySearchTreeTest");

        RecoverBinarySearchTree solution = new RecoverBinarySearchTree();

        /**
         *    1
         *   /
         *  3
         *   \
         *    2
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        solution.recoverTree(root);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.left.right.val);

        /**
         *   3
         *  / \
         * 1   4
         *    /
         *   2
         */
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.right.left = new TreeNode(2);
        solution.recoverTree(root1);
        System.out.println(root1.val);
        System.out.println(root1.left.val);
        System.out.println(root1.right.val);
        System.out.println(root1.right.left.val);


    }
}
