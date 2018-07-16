package leetcode.tree.sumRootToLeafNumbers;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 129. Sum Root to Leaf Numbers
 */
public class SumRootToLeafNumbersTest {

    @Test
    public void test() {

        System.out.println("SumRootToLeafNumbersTest");

        SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
        int ret = 0;

        /**
         *     1
         *    / \
         *   2   3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ret = solution.sumNumbers(root);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(25));

        /**
         *     4
         *    / \
         *   9   0
         *  / \
         * 5   1
         */
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(9);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(1);
        root1.right = new TreeNode(0);
        ret = solution.sumNumbers(root1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1026));

    }
}
