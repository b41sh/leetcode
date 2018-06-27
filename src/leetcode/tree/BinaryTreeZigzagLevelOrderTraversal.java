package leetcode.tree.binaryTreeZigzagLevelOrderTraversal;

// Source : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Author : Shen Bai
// Date   : 2018-06-27

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import leetcode.TreeNode;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * return its zigzag level order traversal as:
 * [
 *  [3],
 *  [20,9],
 *  [15,7]
 * ]
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int depth = 0;
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            if (depth % 2 == 0) {
                while (size > 0) {
                    size--;
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            } else {
                while (size > 0) {
                    size--;
                    TreeNode node = queue.poll();
                    stack.push(node);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                while (stack.size() > 0) {
                    TreeNode node = stack.pop();
                    list.add(node.val);
                }
            }
            ret.add(list);
            depth++;
        }

        return ret;
    }
}