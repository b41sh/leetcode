package leetcode.tree.sameTree;

// Source : https://leetcode.com/problems/same-tree/
// Author : Shen Bai
// Date   : 2018-06-22

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            boolean root = (p.val == q.val) ? true : false;
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            if (root && left && right) {
                return true;
            }
        }
        return false;
    }
}