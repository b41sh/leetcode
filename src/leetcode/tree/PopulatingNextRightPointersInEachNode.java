package leetcode.tree.populatingNextRightPointersInEachNode;

// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
// Author : Shen Bai
// Date   : 2018-07-09

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import leetcode.TreeLinkNode;

/**
 * Given a binary tree
 *
 * struct TreeLinkNode {
 *   TreeLinkNode *left;
 *   TreeLinkNode *right;
 *   TreeLinkNode *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Note:
 *
 * You may only use constant extra space.
 * Recursive approach is fine, implicit stack space does not count as extra space for this problem.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 * Example:
 *
 * Given the following perfect binary tree,
 *
 *      1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * After calling your function, the tree should look like:
 *
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 *
 */
public class PopulatingNextRightPointersInEachNode {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode dummyHead = new TreeLinkNode(0);
        TreeLinkNode prev = dummyHead;

        while (root != null) {
            if (root.left != null) {
                prev.next = root.left;
                prev = prev.next;
            }
            if (root.right != null) {
                prev.next = root.right;
                prev = prev.next;
            }
            root = root.next;
        }
        connect(dummyHead.next);
    }

    public void connect0(TreeLinkNode root) {

        if (root == null) {
            return;
        }
        Stack<TreeLinkNode> stack = new Stack<TreeLinkNode>();
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            while (size > 0) {
                size--;
                TreeLinkNode node = queue.poll();
                stack.push(node);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            TreeLinkNode nextNode = null;
            while (stack.size() > 0) {
                TreeLinkNode node = stack.pop();
                node.next = nextNode;
                nextNode = node;
            }
        }
    }
}
