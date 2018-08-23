package leetcode.tree.countCompleteTreeNodes;

// Source : https://leetcode.com/problems/count-complete-tree-nodes/
// Author : Shen Bai
// Date   : 2018-08-23

import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;

/**
 * Given a complete binary tree, count the number of nodes.
 *
 * Note:
 *
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * Example:
 *
 * Input:
 *     1
 *    / \
 *   2   3
 *  / \  /
 * 4  5 6
 *
 * Output: 6
 */
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int num = 0;
        int leftDepth = _getDepth(root.left);
        int rightDepth = _getDepth(root.right);
        if (rightDepth == leftDepth) {
            int left = (1 << leftDepth) - 1;
            int right = countNodes(root.right);
            num = 1 + left + right;
        } else {
            int left = countNodes(root.left);
            int right = (1 << rightDepth) - 1;
            num = 1 + left + right;
        }
        return num;
    }

    private int _getDepth(TreeNode root) {
        TreeNode node = root;
        int depth = 0;
        while (node != null) {
            node = node.left;
            depth++;
        }
        return depth;
    }

    private int _getCount(int depth) {
        int num = 1;
        int total = 0;
        while (depth > 0) {
            total += num;
            num *= 2;
            depth--;
        }
        return total;
    }


    // timeout
    public int countNodes0(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int num = 0;
        int size = 0;
        while(queue.size() > 0) {
            size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                num++;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            System.out.println("");
        }
        return num;
    }
}
