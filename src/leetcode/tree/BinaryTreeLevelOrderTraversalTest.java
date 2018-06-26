package leetcode.tree.binaryTreeLevelOrderTraversal;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 102. Binary Tree Level Order Traversal
 */
public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void test() {

        System.out.println("BinaryTreeLevelOrderTraversalTest");

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

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

        List<List<Integer>> ret = solution.levelOrder(root);
        System.out.println(ret);

    }
}
