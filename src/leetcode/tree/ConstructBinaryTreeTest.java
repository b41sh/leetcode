package leetcode.tree.constructBinaryTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 105. Construct Binary Tree from Preorder and Inorder Traversal
 * Test for 106. Construct Binary Tree from Inorder and Postorder Traversal
 */
public class ConstructBinaryTreeTest {

    @Test
    public void test() {

        System.out.println("ConstructBinaryTree");

        ConstructBinaryTree solution = new ConstructBinaryTree();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode ret = solution.buildTree(preorder, inorder);

        System.out.println(ret.val);
        System.out.println(ret.left.val);
        System.out.println(ret.right.val);
        System.out.println(ret.right.left.val);
        System.out.println(ret.right.right.val);

        int[] postorder = {9, 15, 7, 20, 3};

        ret = solution.buildTree2(inorder, postorder);
        System.out.println(ret.val);
        System.out.println(ret.left.val);
        System.out.println(ret.right.val);
        System.out.println(ret.right.left.val);
        System.out.println(ret.right.right.val);
    }
}

