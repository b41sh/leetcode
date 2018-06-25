package leetcode.tree.validateBinarySearchTree;

// Source : https://leetcode.com/problems/same-tree/
// Author : Shen Bai
// Date   : 2018-06-22

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * Input:
 *    2
 *   / \
 *  1   3
 * Output: true
 * Example 2:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * Output: false
 * Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 *             is 5 but its right child's value is 4.
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = _isValidBST(root.left, Long.MIN_VALUE, root.val);
        boolean right = _isValidBST(root.right, root.val, Long.MAX_VALUE);

        if (left && right) {
            return true;
        } else {
            return false;
        }
    }

    private boolean _isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        } else if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        boolean left = _isValidBST(root.left, minVal, root.val);
        boolean right = _isValidBST(root.right, root.val, maxVal);

        if (left && right) {
            return true;
        } else {
            return false;
        }
    }
}
