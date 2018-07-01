package leetcode.tree.balancedBinaryTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 110. Balanced Binary Tree
 */
public class BalancedBinaryTreeTest {

    @Test
    public void test() {

        System.out.println("BalancedBinaryTreeTest");

        BalancedBinaryTree solution = new BalancedBinaryTree();
        boolean ret = false;

        /*
               1
             /   \
            2      3
          /   \
         4     5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ret = solution.isBalanced(root);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

    }
}
