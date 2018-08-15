package leetcode.tree.binaryTreePreorderTraversal;

// Source : https://leetcode.com/problems/binary-tree-preorder-traversal/
// Author : Shen Bai
// Date   : 2018-08-15

import java.util.List;
import java.util.ArrayList;
import leetcode.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,2,3]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {

    // Morris Traversal
    public List<Integer> preorderTraversal0(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null) {
            if (cur.left == null) {
                list.add(cur.val);
                cur = cur.right;
            } else {
                prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    list.add(cur.val);
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        TreeNode cur = root;
        TreeNode prev = null;
        TreeNode next = null;
        while (cur != null) {
            list.add(cur.val);
            if (cur.right != null) {
                next = cur.right;
            }
            if (cur.left == null) {
                cur = cur.right;
                next = null;
            } else {
                prev = cur.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = next;
                cur = cur.left;
            }
        }

        return list;
    }
}