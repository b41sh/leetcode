package leetcode.tree.flattenBinaryTreeToLinkedList;

// Source : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Author : Shen Bai
// Date   : 2018-07-05

import leetcode.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example, given the following tree:
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        root.left = null;
        if (leftNode != null) {
            root.right = leftNode;
            flatten(leftNode);
            while (leftNode.right != null) {
                leftNode = leftNode.right;
            }
            leftNode.right = rightNode;
        }
        if (rightNode != null) {
            flatten(rightNode);
        }
    }
}
