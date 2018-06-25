package leetcode.tree.validateBinarySearchTree;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 98. Validate Binary Search Tree
 */
public class ValidateBinarySearchTreeTest {

    @Test
    public void test() {

        System.out.println("ValidateBinarySearchTreeTest");

        ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

        /*
               1
             /   \
            2      3
          /   \
         4     5
        */
        TreeNode p = new TreeNode(2);
        p.left = new TreeNode(1);
        p.right = new TreeNode(3);

        boolean ret = solution.isValidBST(p);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

    }
}
