package leetcode.tree.convertSortedListToBinarySearchTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;
import leetcode.TreeNode;

/**
 * Test for 109. Convert Sorted List to Binary Search Tree
 */
public class ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void test() {

        System.out.println("ConvertSortedListToBinarySearchTreeTest");

        ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();

        int nums[] = new int[]{-10, -3, 0, 5, 9};

        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        for (int i = 0; i < nums.length; i++) {
            pre.next = new ListNode(nums[i]);
            pre = pre.next;
        }

        TreeNode node = solution.sortedListToBST(dummyHead.next);
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
