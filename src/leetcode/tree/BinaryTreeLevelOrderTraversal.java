package leetcode.tree.binaryTreeLevelOrderTraversal;

// Source : https://leetcode.com/problems/binary-tree-level-order-traversal/
// Author : Shen Bai
// Date   : 2018-06-26

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * return its level order traversal as:
 * [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
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
            ret.add(list);
        }

        return ret;
    }
}