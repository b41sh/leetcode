package leetcode.tree.binaryTreeRightSideView;

// Source : https://leetcode.com/problems/binary-tree-right-side-view/
// Author : Shen Bai
// Date   : 2018-10-24

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import leetcode.TreeNode;

/**
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 *
 * Example:
 *
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 *
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 */
public class BinaryTreeRightSideView {

    // bfs
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int size = 1;
        while (size > 0) {
            boolean isFirst = true;
            while (size > 0) {
                TreeNode node = queue.poll();
                if (isFirst) {
                    list.add(node.val);
                    isFirst = false;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                size--;
            }
            size = queue.size();
        }

        return list;
    }

    // dfs recursion
    public List<Integer> rightSideView2(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        traversal(root, list, 0);
        return list;
    }

    private void traversal(TreeNode node, List<Integer> list, Integer depth) {
        if (node == null) {
            return;
        }
        if (depth == list.size()) {
            list.add(node.val);
        }
        traversal(node.right, list, depth + 1);
        traversal(node.left, list, depth + 1);
    }

    // dfs stack
    public List<Integer> rightSideView3(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();
        nodeStack.push(root);
        depthStack.push(0);
        while (nodeStack.size() > 0) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if (node == null) {
                continue;
            }
            if (depth >= list.size()) {
                list.add(node.val);
            }
            nodeStack.push(node.left);
            nodeStack.push(node.right);
            depthStack.push(depth + 1);
            depthStack.push(depth + 1);
        }

        return list;
    }
}

