package leetcode.tree.flattenBinaryTreeToLinkedList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 114. Flatten Binary Tree to Linked List
 */
public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test() {

        System.out.println("FlattenBinaryTreeToLinkedListTest");

        FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

        /*
         *     1
         *    / \
         *   2   5
         *  / \   \
         * 3   4   6
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        solution.flatten(root);

        while (root != null) {
            System.out.println(root.val);
            root = root.right;
        }

    }
}
