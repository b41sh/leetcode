package leetcode.tree.kthSmallestElementInAbst;

// Source : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Author : Shen Bai
// Date   : 2018-10-25

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 *
 */
public class KthSmallestElementInAbst {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        recursion(root, list);
        return list.get(k - 1);
    }

    private void recursion(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            recursion(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            recursion(node.right, list);
        }
    }
}
