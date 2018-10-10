package leetcode.design.bstIterator;

// Source : https://leetcode.com/problems/binary-search-tree-iterator/
// Author : Shen Bai
// Date   : 2018-10-10

import java.util.Stack;
import leetcode.TreeNode;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 *
 * Credits:
 * Special thanks to @ts for adding this problem and creating all test cases.
 */

public class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !this.stack.empty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        if (this.stack.empty()) {
            return 0;
        }
        TreeNode node = this.stack.pop();
        TreeNode next = node.right;
        while (next != null) {
            stack.push(next);
            next = next.left;
        }
        return node.val;
    }
}
