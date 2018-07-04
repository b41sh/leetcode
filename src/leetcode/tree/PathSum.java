package leetcode.tree.pathSum;

// Source : https://leetcode.com/problems/path-sum/
// Author : Shen Bai
// Date   : 2018-07-03

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * Note: A leaf is a node with no children.
 * Example:
 * Given the below binary tree and sum = 22,
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * Note: A leaf is a node with no children.
 * Example:
 * Given the below binary tree and sum = 22,
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 * [
 *   [5,4,11,2],
 *   [5,8,4,5]
 * ]
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return _hasPathSum(root, sum);
    }

    private boolean _hasPathSum(TreeNode node, int sum) {
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                return true;
            }
            return false;
        } else if (node.left != null && node.right != null) {
            boolean leftRet = _hasPathSum(node.left, sum - node.val);
            boolean rightRet = _hasPathSum(node.right, sum - node.val);
            if (leftRet || rightRet) {
                return true;
            }
            return false;
        } else if (node.left != null) {
            return _hasPathSum(node.left, sum - node.val);
        } else {
            return _hasPathSum(node.right, sum - node.val);
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) {
            return list;
        }

        List<Integer> item = new ArrayList<Integer>();
        _pathSum(root, sum, item, list);
        return list;
    }


    private void _pathSum(TreeNode node, int sum, List<Integer> item, List<List<Integer>> list) {

        item.add(node.val);
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                list.add(item);
            }
        }
        if (node.left != null) {
            List<Integer> leftItem = new ArrayList<Integer>(item);
            _pathSum(node.left, sum - node.val, leftItem, list);
        }
        if (node.right != null) {
            List<Integer> rightItem = new ArrayList<Integer>(item);
            _pathSum(node.right, sum - node.val, rightItem, list);
        }
    }
}
