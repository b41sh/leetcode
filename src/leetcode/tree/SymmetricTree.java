package leetcode.tree.symmetricTree;

// Source : https://leetcode.com/problems/symmetric-tree/
// Author : Shen Bai
// Date   : 2018-06-26

import leetcode.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *    1
 *   / \
 *  2   2
 *   \   \
 *   3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return _isSymmetric(root.left, root.right);
    }

    private boolean _isSymmetric(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        } else if (leftRoot == null || rightRoot == null) {
            return false;
        } else if (leftRoot.val != rightRoot.val) {
            return false;
        }

        boolean left = _isSymmetric(leftRoot.left, rightRoot.right);
        boolean right = _isSymmetric(leftRoot.right, rightRoot.left);
        if (left && right) {
            return true;
        }

        return false;
    }
}