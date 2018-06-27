package leetcode.tree.binaryTreeZigzagLevelOrderTraversal;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 103. Binary Tree Zigzag Level Order Traversal
 */
public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void test() {

        System.out.println("BinaryTreeZigzagLevelOrderTraversalTest");

        BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();

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

        List<List<Integer>> ret = solution.zigzagLevelOrder(root);
        System.out.println(ret);

        /**
         *     1
         *    / \
         *   2   3
         *  /     \
         * 4       5
         */
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.right.right = new TreeNode(5);

        List<List<Integer>> ret1 = solution.zigzagLevelOrder(root1);
        System.out.println(ret1);

    }
}
