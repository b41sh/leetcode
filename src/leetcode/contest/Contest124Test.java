package leetcode.contest.contest124;

import leetcode.TreeNode;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 124
 */
public class Contest124Test {
    @Test
    public void test() {

        System.out.println("Contest124Test");

        Contest124 solution = new Contest124();

        TreeNode root11 = new TreeNode(1);
        root11.left = new TreeNode(2);
        root11.right = new TreeNode(3);
        root11.left.left = new TreeNode(4);
        int x11 = 4;
        int y11 = 3;
        boolean ret11 = solution.isCousins(root11, x11, y11);
        System.out.println(ret11);
        Assert.assertTrue(new Boolean(ret11).equals(false));

        TreeNode root12 = new TreeNode(1);
        root12.left = new TreeNode(2);
        root12.right = new TreeNode(3);
        root12.left.right = new TreeNode(4);
        root12.right.right = new TreeNode(5);
        int x12 = 5;
        int y12 = 4;
        boolean ret12 = solution.isCousins(root12, x12, y12);
        System.out.println(ret12);
        Assert.assertTrue(new Boolean(ret12).equals(true));

        TreeNode root13 = new TreeNode(1);
        root13.left = new TreeNode(2);
        root13.right = new TreeNode(3);
        root13.left.right = new TreeNode(4);
        int x13 = 2;
        int y13 = 3;
        boolean ret13 = solution.isCousins(root13, x13, y13);
        System.out.println(ret13);
        Assert.assertTrue(new Boolean(ret13).equals(false));


        int[][] grid21 = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        int ret21 = solution.orangesRotting(grid21);
        System.out.println(ret21);
        Assert.assertTrue(new Integer(ret21).equals(4));

        int[][] grid22 = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        int ret22 = solution.orangesRotting(grid22);
        System.out.println(ret22);
        Assert.assertTrue(new Integer(ret22).equals(-1));

        int[][] grid23 = new int[][]{{0,2}};
        int ret23 = solution.orangesRotting(grid23);
        System.out.println(ret23);
        Assert.assertTrue(new Integer(ret23).equals(0));

        int[][] grid24 = new int[][]{{1,2,2,2,0},{2,1,1,1,0}};
        int ret24 = solution.orangesRotting(grid24);
        System.out.println(ret24);
        Assert.assertTrue(new Integer(ret24).equals(1));

        int[][] grid25 = new int[][]{{1,2}};
        int ret25 = solution.orangesRotting(grid25);
        System.out.println(ret25);
        Assert.assertTrue(new Integer(ret25).equals(1));


        int[] A31 = new int[]{0,1,0};
        int K31 = 1;
        int ret31 = solution.minKBitFlips(A31, K31);
        System.out.println(ret31);
        Assert.assertTrue(new Integer(ret31).equals(2));

        int[] A32 = new int[]{1,1,0};
        int K32 = 2;
        int ret32 = solution.minKBitFlips(A32, K32);
        System.out.println(ret32);
        Assert.assertTrue(new Integer(ret32).equals(-1));

        int[] A33 = new int[]{0,0,0,1,0,1,1,0};
        int K33 = 3;
        int ret33 = solution.minKBitFlips(A33, K33);
        System.out.println(ret33);
        Assert.assertTrue(new Integer(ret33).equals(3));


    }
}
