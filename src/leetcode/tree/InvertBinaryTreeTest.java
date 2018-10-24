package leetcode.tree.invertBinaryTree;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 226. Invert Binary Tree
 */
public class InvertBinaryTreeTest {

    @Test
    public void test() {

        System.out.println("InvertBinaryTreeTest");

        InvertBinaryTree solution = new InvertBinaryTree();

        /**
         *  *      4
         *  *    /   \
         *  *   2     7
         *  *  / \   / \
         *  * 1   3 6   9
         *  * Output:
         *  *
         *  *      4
         *  *    /   \
         *  *   7     2
         *  *  / \   / \
         *  * 9   6 3   1
         *
         */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode retRoot = solution.invertTree(root);
        System.out.println(retRoot.val);
        System.out.println(retRoot.left.val + "  " + retRoot.right.val);
        System.out.print(retRoot.left.left.val + "  " + retRoot.left.right.val + "  ");
        System.out.println(retRoot.right.left.val + "  " + retRoot.right.right.val);


        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(9);

        TreeNode retRoot1 = solution.invertTree1(root1);
        System.out.println(retRoot1.val);
        System.out.println(retRoot1.left.val + "  " + retRoot1.right.val);
        System.out.print(retRoot1.left.left.val + "  " + retRoot1.left.right.val + "  ");
        System.out.println(retRoot1.right.left.val + "  " + retRoot1.right.right.val);

    }
}
