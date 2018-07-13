package leetcode.tree.recoverBinarySearchTree;

// Source : https://leetcode.com/problems/recover-binary-search-tree/
// Author : Shen Bai
// Date   : 2018-07-13

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.TreeNode;

/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 *
 * Example 1:
 * Input: [1,3,null,null,2]
 *    1
 *   /
 *  3
 *   \
 *    2
 * Output: [3,1,null,null,2]
 *    3
 *   /
 *  1
 *   \
 *    2
 * Example 2:
 * Input: [3,1,4,null,null,2]
 *   3
 *  / \
 * 1   4
 *    /
 *   2
 * Output: [2,1,4,null,null,3]
 *   2
 *  / \
 * 1   4
 *    /
 *   3
 * Follow up:
 * A solution using O(n) space is pretty straight forward.
 * Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree {

    // O(n) space
    // @todo O(1) space
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        List<TreeNode> list = new ArrayList<TreeNode>();
        _inorderTraversal(root, list);

        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i).val;
        }

        Arrays.sort(nums);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).val = nums[i];
        }
    }

    private void _inorderTraversal(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }
        _inorderTraversal(node.left, list);
        list.add(node);
        _inorderTraversal(node.right, list);
    }
}