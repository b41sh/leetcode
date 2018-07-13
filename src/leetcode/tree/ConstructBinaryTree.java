package leetcode.tree.constructBinaryTree;

// Source : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Source : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Author : Shen Bai
// Date   : 2018-07-13

import java.util.HashMap;
import java.util.Map;
import leetcode.TreeNode;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * For example, given
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 *
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class ConstructBinaryTree {

    // ConstructBinaryTreeFromPreorderAndInorderTraversal
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int length = preorder.length;
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode node = _buildTree(preorder, inorder, 0, length - 1, 0, length - 1, inMap);
        return node;
    }

    private TreeNode _buildTree(int[] preorder, int[] inorder, int preStart, int preEnd,
                            int inStart, int inEnd, Map<Integer, Integer> inMap) {

        if (preStart < 0) {
            return null;
        }
        int val = preorder[preStart];
        TreeNode node = new TreeNode(val);
        if (preStart == preEnd) {
            return node;
        }

        int inMid = inMap.get(val);

        int leftInStart = inStart;
        int leftInEnd = inMid - 1;
        int rightInStart = inMid + 1;
        int rightInEnd = inEnd;

        int leftSize = leftInEnd - leftInStart;
        int rightSize = rightInEnd - rightInStart;

        int leftPreStart = preStart + 1;
        int leftPreEnd = leftPreStart + leftSize;
        int rightPreStart = leftPreEnd + 1;
        int rightPreEnd = rightPreStart + rightSize;

        if (leftSize >= 0) {
            node.left = _buildTree(preorder, inorder, leftPreStart, leftPreEnd,
                                    leftInStart, leftInEnd, inMap);
        }
        if (rightSize >= 0) {
            node.right = _buildTree(preorder, inorder, rightPreStart, rightPreEnd,
                                    rightInStart, rightInEnd, inMap);
        }

        return node;
    }


    // ConstructBinaryTreeFromInorderAndPostorderTraversal
    public TreeNode buildTree2(int[] inorder, int[] postorder) {

        if (postorder.length == 0) {
            return null;
        }
        int length = postorder.length;
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode node = _buildTree2(postorder, inorder, 0, length - 1, 0, length - 1, inMap);
        return node;
    }


    private TreeNode _buildTree2(int[] postorder, int[] inorder, int postStart, int postEnd,
                                int inStart, int inEnd, Map<Integer, Integer> inMap) {

        int val = postorder[postEnd];
        TreeNode node = new TreeNode(val);
        if (postStart == postEnd) {
            return node;
        }

        int inMid = inMap.get(val);

        int leftInStart = inStart;
        int leftInEnd = inMid - 1;
        int rightInStart = inMid + 1;
        int rightInEnd = inEnd;

        int leftSize = leftInEnd - leftInStart;
        int rightSize = rightInEnd - rightInStart;

        int leftPostStart = postStart;
        int leftPostEnd = leftPostStart + leftSize;
        int rightPostStart = leftPostEnd + 1;
        int rightPostEnd = rightPostStart + rightSize;

        if (leftSize >= 0) {
            node.left = _buildTree2(postorder, inorder, leftPostStart, leftPostEnd,
                    leftInStart, leftInEnd, inMap);
        }
        if (rightSize >= 0) {
            node.right = _buildTree2(postorder, inorder, rightPostStart, rightPostEnd,
                    rightInStart, rightInEnd, inMap);
        }

        return node;
    }
}
