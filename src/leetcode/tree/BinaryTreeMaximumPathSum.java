package leetcode.tree.binaryTreeMaximumPathSum;

// Source : https://leetcode.com/problems/binary-tree-maximum-path-sum
// Author : Shen Bai
// Date   : 2018-07-13

import leetcode.TreeNode;

/**
 * Given a non-empty binary tree, find the maximum path sum.
 *
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * Output: 6
 * Example 2:
 *
 * Input: [-10,9,20,null,null,15,7]
 *
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * Output: 42
 */
public class BinaryTreeMaximumPathSum {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        _maxPathSum(root);
        return maxSum;
    }

    private int _maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = Math.max(0, _maxPathSum(root.left));
        int rightVal = Math.max(0, _maxPathSum(root.right));
        int sum = leftVal + rightVal + root.val;
        maxSum = Math.max(maxSum, sum);
        return Math.max(leftVal, rightVal) + root.val;
    }
}
