package leetcode.tree.sameTree;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 100. Same Tree
 */
public class SameTreeTest {

    @Test
    public void test() {

        System.out.println("SameTreeTest");

        SameTree solution = new SameTree();

        /*
               1
             /   \
            2      3
          /   \
         4     5
        */
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);

        boolean ret = solution.isSameTree(p, q);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

    }
}
