package leetcode.tree.invertBinaryTree;

// Source : https://leetcode.com/problems/invert-binary-tree/
// Author : Shen Bai
// Date   : 2018-10-24

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import leetcode.TreeNode;

/**
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 *
 * Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 *
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> currStack = new Stack<TreeNode>();
        Stack<TreeNode> nextStack = new Stack<TreeNode>();
        queue.offer(root);
        int size = 1;
        while (size > 0) {
            while (size > 0) {
                TreeNode node = queue.poll();
                currStack.push(node);
                nextStack.push(node.left);
                nextStack.push(node.right);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            while (currStack.size() > 0) {
                TreeNode node = currStack.pop();
                node.left = nextStack.pop();
                node.right = nextStack.pop();
            }
            size = queue.size();
        }

        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree1(root.left);
        TreeNode right = invertTree1(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}
