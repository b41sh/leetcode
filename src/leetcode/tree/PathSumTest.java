package leetcode.tree.pathSum;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 112. Path Sum
 * Test for 113. Path Sum II
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

        /*
         *       5
         *      / \
         *     4   8
         *    /   / \
         *   11  13  4
         *  /  \    / \
         * 7    2  5   1
         * Return:
         * [
         *   [5,4,11,2],
         *   [5,8,4,5]
         */
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(11);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(2);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(4);
        root2.right.right.left = new TreeNode(5);
        root2.right.right.right = new TreeNode(1);
        int sum2 = 22;
        List<List<Integer>> ret2 = solution.pathSum(root2, sum2);
        System.out.println(ret2);
        //Assert.assertTrue(new Boolean(ret).equals(true));

    }
}
