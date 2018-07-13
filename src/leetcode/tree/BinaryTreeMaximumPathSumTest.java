package leetcode.tree.binaryTreeMaximumPathSum;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 124. Binary Tree Maximum Path Sum
 */
public class BinaryTreeMaximumPathSumTest {

    @Test
    public void test() {

        System.out.println("BinaryTreeMaximumPathSumTest");

        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int ret = 0;

        /**
         * Input: [1,2,3]
         *
         *        1
         *       / \
         *      2   3
         *
         * Output: 6
         * Example 2:
         *
         * Input: [-10,9,20,null,null,15,7]
         *
         *    -10
         *    / \
         *   9  20
         *     /  \
         *    15   7
         *
         * Output: 42
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ret = solution.maxPathSum(root);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(6));

        TreeNode root1 = new TreeNode(-10);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        ret = solution.maxPathSum(root1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(42));
    }
}
