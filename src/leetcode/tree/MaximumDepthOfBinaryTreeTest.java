package leetcode.tree.maximumDepthOfBinaryTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 104. Maximum Depth of Binary Tree
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test() {

        System.out.println("MaximumDepthOfBinaryTreeTest");

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

        /**
         *    3
         *   / \
         *  9  20
         *    /  \
         *   15   7
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(8);

        int ret = solution.maxDepth(root);
        System.out.println(ret);

    }
}
