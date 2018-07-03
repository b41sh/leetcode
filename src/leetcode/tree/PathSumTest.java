package leetcode.tree.pathSum;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 112. Path Sum
 */
public class PathSumTest {

    @Test
    public void test() {

        System.out.println("PathSumTest");

        PathSum solution = new PathSum();
        boolean ret = false;

        /*
         *       5
         *      / \
         *     4   8
         *    /   / \
         *   11  13  4
         *  /  \      \
         * 7    2      1
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int sum = 22;
        ret = solution.hasPathSum(root, sum);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        TreeNode root1 = new TreeNode(1);
        int sum1 = 1;
        ret = solution.hasPathSum(root1, sum1);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
