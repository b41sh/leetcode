package leetcode.contest.contest125;

import java.util.*;
import leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 125
 */
public class Contest125Test {
    @Test
    public void test() {

        System.out.println("Contest125Test");

        Contest125 solution = new Contest125();

        int N11 = 2;
        int[][] trust11 = new int[][]{{1,2}};
        int ret11 = solution.findJudge(N11, trust11);
        System.out.println(ret11);
        Assert.assertTrue(new Integer(ret11).equals(2));

        int N12 = 3;
        int[][] trust12 = new int[][]{{1,3},{2,3}};
        int ret12 = solution.findJudge(N12, trust12);
        System.out.println(ret12);
        Assert.assertTrue(new Integer(ret12).equals(3));

        int N13 = 3;
        int[][] trust13 = new int[][]{{1,3},{2,3},{3,1}};
        int ret13 = solution.findJudge(N13, trust13);
        System.out.println(ret13);
        Assert.assertTrue(new Integer(ret13).equals(-1));

        int N14 = 3;
        int[][] trust14 = new int[][]{{1,2},{2,3}};
        int ret14 = solution.findJudge(N14, trust14);
        System.out.println(ret14);
        Assert.assertTrue(new Integer(ret14).equals(-1));

        int N15 = 4;
        int[][] trust15 = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        int ret15 = solution.findJudge(N15, trust15);
        System.out.println(ret15);
        Assert.assertTrue(new Integer(ret15).equals(3));

        char[][] board21 = new char[][]{
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','R','.','.','.','p'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}};
        int ret21 = solution.numRookCaptures(board21);
        System.out.println(ret21);
        Assert.assertTrue(new Integer(ret21).equals(3));

        char[][] board22 = new char[][]{
            {'.','.','.','.','.','.','.','.'},
            {'.','p','p','p','p','p','.','.'},
            {'.','p','p','B','p','p','.','.'},
            {'.','p','B','R','B','p','.','.'},
            {'.','p','p','B','p','p','.','.'},
            {'.','p','p','p','p','p','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}};
        int ret22 = solution.numRookCaptures(board22);
        System.out.println(ret22);
        Assert.assertTrue(new Integer(ret22).equals(0));

        char[][] board23 = new char[][]{
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'p','p','.','R','.','p','B','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','B','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}};
        int ret23 = solution.numRookCaptures(board23);
        System.out.println(ret23);
        Assert.assertTrue(new Integer(ret23).equals(3));


        TreeNode node31 = new TreeNode(4);
        node31.left = new TreeNode(1);
        node31.right = new TreeNode(3);
        node31.right.left = new TreeNode(2);
        int val31 = 5;
        TreeNode ret31 = solution.insertIntoMaxTree(node31, val31);
        System.out.print(ret31.val + " ");
        System.out.print(ret31.left.val + " ");
        System.out.print(ret31.left.left.val + " ");
        System.out.print(ret31.left.right.val + " ");
        System.out.print(ret31.left.right.left.val + " ");
        System.out.println("");

        TreeNode node32 = new TreeNode(5);
        node32.left = new TreeNode(2);
        node32.right = new TreeNode(4);
        node32.left.right = new TreeNode(1);
        int val32 = 3;
        TreeNode ret32 = solution.insertIntoMaxTree(node32, val32);
        System.out.print(ret32.val + " ");
        System.out.print(ret32.left.val + " ");
        System.out.print(ret32.right.val + " ");
        System.out.print(ret32.left.right.val + " ");
        System.out.print(ret32.right.right.val + " ");
        System.out.println("");

        TreeNode node33 = new TreeNode(5);
        node33.left = new TreeNode(2);
        node33.right = new TreeNode(3);
        node33.left.right = new TreeNode(1);
        int val33 = 4;
        TreeNode ret33 = solution.insertIntoMaxTree(node33, val33);
        System.out.print(ret33.val + " ");
        System.out.print(ret33.left.val + " ");
        System.out.print(ret33.right.val + " ");
        System.out.print(ret33.left.right.val + " ");
        System.out.print(ret33.right.left.val + " ");
        System.out.println("");


        int N41 = 5;
        int[][] lamps41 = new int[][]{{0,0},{4,4}};
        int[][] queries41 = new int[][]{{1,1},{1,0}};
        int[] ret41 = solution.gridIllumination(N41, lamps41, queries41);
        for (int i = 0; i < ret41.length; i++) {
            System.out.print(ret41[i] + " ");
        }
        System.out.println("");
    }
}
