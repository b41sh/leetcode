package leetcode.tree.minimumDepthOfBinaryTree;

// Source : https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Author : Shen Bai
// Date   : 2018-07-13

import leetcode.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its minimum depth = 2.
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        leftDepth++;
        rightDepth++;
        if (leftDepth == 1) {
            return rightDepth;
        } else if (rightDepth == 1) {
            return leftDepth;
        } else {
            return Math.min(leftDepth, rightDepth);
        }
    }
}
