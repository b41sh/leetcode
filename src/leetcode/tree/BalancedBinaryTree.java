package leetcode.tree.balancedBinaryTree;

// Source : https://leetcode.com/problems/balanced-binary-tree/
// Author : Shen Bai
// Date   : 2018-07-01

import leetcode.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int depth = 0;
        int leftDepth = _isBalanced(root.left, depth);
        int rightDepth = _isBalanced(root.right, depth);
        if (leftDepth == -1 || rightDepth == -1) {
            return false;
        } else if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        } else {
            return true;
        }
    }

    private int _isBalanced(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        int leftDepth = _isBalanced(node.left, depth + 1);
        int rightDepth = _isBalanced(node.right, depth + 1);
        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        } else if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        } else {
            return Math.max(leftDepth, rightDepth);
        }
    }
}
