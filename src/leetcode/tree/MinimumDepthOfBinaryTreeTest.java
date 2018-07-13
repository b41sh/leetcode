package leetcode.tree.minimumDepthOfBinaryTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 111. Minimum Depth of Binary Tree
 */
public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void test() {

        System.out.println("MinimumDepthOfBinaryTreeTest");

        MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        Integer ret = 0;

        /*
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        ret = solution.minDepth(root);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        /*
         *     1
         *    /
         *   2
         */
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        ret = solution.minDepth(root1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        /*
         *     1
         *    / \
         *   2   3
         *  /     \
         * 4       5
         */
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(2);
        root2.right.right = new TreeNode(5);
        ret = solution.minDepth(root2);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(3));
    }
}
