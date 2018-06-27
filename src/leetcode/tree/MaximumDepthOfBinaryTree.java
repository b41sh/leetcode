package leetcode.tree.maximumDepthOfBinaryTree;

// Source : https://leetcode.com/problems/binary-tree-level-order-traversal/
// Author : Shen Bai
// Date   : 2018-06-27

import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * return its depth = 3.
 */
public class MaximumDepthOfBinaryTree {

    // dfs
    public int maxDepth(TreeNode root) {
        return _maxDepth(root, 0);
    }

    private int _maxDepth(TreeNode root, int depth) {

        if (root == null) {
            return depth;
        }
        depth++;
        int leftDepth = _maxDepth(root.left, depth);
        int rightDepth = _maxDepth(root.right, depth);
        return Math.max(leftDepth, rightDepth);
    }

    // bfs
    public int maxDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            depth++;
            while (size > 0) {
                size--;
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return depth;
    }
}