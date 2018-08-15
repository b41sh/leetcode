package leetcode.tree.binaryTreePreorderTraversal;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 144. Binary Tree Preorder Traversal
 */
public class BinaryTreePreorderTraversalTest {

    @Test
    public void test() {

        System.out.println("BinaryTreePreorderTraversalTest");

        BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        List<Integer> ret = new ArrayList<Integer>();

        /**
               1
             /   \
            2      3
          /   \
         4     5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ret = solution.preorderTraversal(root);
        System.out.println(ret);

        /**
            1
             \
              2
             /
            3
        */
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        ret = solution.preorderTraversal(root1);
        System.out.println(ret);


        /**
                6
              /   \
            2      7
          /  \      \
         1   4       9
            / \     /
           3   5   8
         */
        TreeNode root2 = new TreeNode(6);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.left.right.left = new TreeNode(3);
        root2.left.right.right = new TreeNode(5);
        root2.right = new TreeNode(7);
        root2.right.right = new TreeNode(9);
        root2.right.right.left = new TreeNode(8);

        ret = solution.preorderTraversal(root2);
        System.out.println(ret);

    }
}
