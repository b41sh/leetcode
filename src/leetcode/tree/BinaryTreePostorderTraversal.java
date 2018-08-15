package leetcode.tree.binaryTreePostorderTraversal;

// Source : https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author : Shen Bai
// Date   : 2018-08-15

import java.util.List;
import java.util.LinkedList;
import leetcode.TreeNode;

/**
 * Given a binary tree, return the postorder traversal of its currs' values.
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
 * Output: [3,2,1]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal {

    // Morris Traversal
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();
        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            if (curr.right == null) {
                list.add(0, curr.val);
                curr = curr.left;
            } else {
                prev = curr.right;
                while (prev.left != null && prev.left != curr) {
                    prev = prev.left;
                }
                if (prev.left == null) {
                    prev.left = curr;
                    list.add(0, curr.val);
                    curr = curr.right;
                } else {
                    prev.left = null;
                    curr = curr.left;
                }
            }
        }
        return list;
    }
}
