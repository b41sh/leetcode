package leetcode.tree.pathSum;

// Source : https://leetcode.com/problems/path-sum/
// Author : Shen Bai
// Date   : 2018-07-03

import leetcode.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * Note: A leaf is a node with no children.
 * Example:
 * Given the below binary tree and sum = 22,
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return _inorderTraversal(root, sum);
    }

    private boolean _inorderTraversal(TreeNode node, int sum) {
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                return true;
            }
            return false;
        } else if (node.left != null && node.right != null) {
            boolean leftRet = _inorderTraversal(node.left, sum - node.val);
            boolean rightRet = _inorderTraversal(node.right, sum - node.val);
            if (leftRet || rightRet) {
                return true;
            }
            return false;
        } else if (node.left != null) {
            return _inorderTraversal(node.left, sum - node.val);
        } else {
            return _inorderTraversal(node.right, sum - node.val);
        }
    }
}
