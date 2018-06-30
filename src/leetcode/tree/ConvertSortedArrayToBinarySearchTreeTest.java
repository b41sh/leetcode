package leetcode.tree.convertSortedArrayToBinarySearchTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 108. Convert Sorted Array to Binary Search Tree
 */
public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void test() {

        System.out.println("ConvertSortedArrayToBinarySearchTreeTest");

        ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

        int nums[] = new int[]{-10, -3, 0, 5, 9};

        TreeNode node = solution.sortedArrayToBST(nums);
        System.out.println(node.val);
        System.out.println(node.left.val);
        System.out.println(node.right.val);
        if (node.left.left != null) {
            System.out.println("left.left= " + node.left.left.val);
        }
        if (node.left.right != null) {
            System.out.println("left.right= " + node.left.right.val);
        }
        if (node.right.left != null) {
            System.out.println("right.left= " + node.right.left.val);
        }
        if (node.right.right != null) {
            System.out.println("right.right= " + node.right.right.val);
        }

    }
}
