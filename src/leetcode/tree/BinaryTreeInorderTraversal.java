package leetcode.tree.binaryTreeInorderTraversal;

// Source : https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author : Shen Bai
// Date   : 2018-06-19

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.TreeNode;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * Example:
 * Input: [1,null,2,3]
 *   1
 *    \
 *     2
 *    /
 *   3
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {

    // stack
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode node = root;
        while (!stack.empty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    // recursion
    public List<Integer> inorderTraversal1(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        _inorderTraversal(root, list);
        return list;
    }

    private void _inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        _inorderTraversal(node.left, list);
        list.add(node.val);
        _inorderTraversal(node.right, list);
    }
}

/**
        TreeNode node = root;
        while (node != null) {
            TreeNode left = node.left;
            TreeNode right = node.right;
            if (left != null) {
                stack.push(node);
                node = left;
            //} else if (right != null) {
            }

            ret.add(node.val);
                stack.push(node);
                node = right;
            } else {
                ret.add(node.val);
                if (stack.empty()) {
                    node = null;
                } else {
                    node = stack.pop();
                }
            }
        }
*/