package leetcode.tree.binaryTreeInorderTraversal;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 92. Reverse Linked List II
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void test() {

        System.out.println("BinaryTreeInorderTraversalTest");

        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        List<Integer> ret = new ArrayList<Integer>();

        /*
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
        ret = solution.inorderTraversal(root);
        System.out.println(ret);

        /*
            1
             \
              2
             /
            3
        */
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        ret = solution.inorderTraversal(root1);
        System.out.println(ret);
    }
}
