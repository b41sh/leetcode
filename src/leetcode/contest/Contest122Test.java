package leetcode.contest.contest122;

import leetcode.Interval;
import leetcode.TreeNode;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 122
 */
public class Contest122Test {
    @Test
    public void test() {

        System.out.println("Contest122Test");

        Contest122 solution = new Contest122();

        int[] A11 = new int[]{1,2,3,4};
        int[][] queries11 = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};
        int[] ret11 = solution.sumEvenAfterQueries(A11, queries11);
        for (int i = 0; i < ret11.length; i++) {
            System.out.print(ret11[i] + " ");
        }
        System.out.println("");

        int[] A12 = new int[]{1,2,3,4};
        int[][] queries12 = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};
        int[] ret12 = solution.sumEvenAfterQueries2(A12, queries12);
        for (int i = 0; i < ret12.length; i++) {
            System.out.print(ret12[i] + " ");
        }
        System.out.println("");

        TreeNode node21 = new TreeNode(0);
        node21.left = new TreeNode(1);
        node21.right = new TreeNode(2);
        node21.left.left = new TreeNode(3);
        node21.left.right = new TreeNode(4);
        node21.right.left = new TreeNode(5);
        node21.right.right = new TreeNode(6);
        String ret21 = solution.smallestFromLeaf(node21);
        System.out.println(ret21);
        Assert.assertTrue(ret21.equals("dba"));

        TreeNode node22 = new TreeNode(25);
        node22.left = new TreeNode(1);
        node22.right = new TreeNode(3);
        node22.left.left = new TreeNode(1);
        node22.left.right = new TreeNode(3);
        node22.right.left = new TreeNode(0);
        node22.right.right = new TreeNode(2);
        String ret22 = solution.smallestFromLeaf(node22);
        System.out.println(ret22);
        Assert.assertTrue(ret22.equals("adz"));

        TreeNode node23 = new TreeNode(2);
        node23.left = new TreeNode(2);
        node23.right = new TreeNode(1);
        node23.left.right = new TreeNode(1);
        node23.left.right.left = new TreeNode(0);
        node23.right.left = new TreeNode(0);
        String ret23 = solution.smallestFromLeaf(node23);
        System.out.println(ret23);
        Assert.assertTrue(ret23.equals("abc"));

        Interval[] A31 = new Interval[4];
        A31[0] = new Interval(0, 2);
        A31[1] = new Interval(5, 10);
        A31[2] = new Interval(13, 23);
        A31[3] = new Interval(24, 25);
        Interval[] B31 = new Interval[4];
        B31[0] = new Interval(1, 5);
        B31[1] = new Interval(8, 12);
        B31[2] = new Interval(15, 24);
        B31[3] = new Interval(25, 26);

        Interval[] ret31 = solution.intervalIntersection(A31, B31);
        for (int i = 0; i < ret31.length; i++) {
            System.out.println("x=" + ret31[i].start + " y=" + ret31[i].end);
        }

        TreeNode node41 = new TreeNode(3);
        node41.left = new TreeNode(9);
        node41.right = new TreeNode(20);
        node41.right.left = new TreeNode(15);
        node41.right.right = new TreeNode(7);
        List<List<Integer>> ret41 = solution.verticalTraversal(node41);
        System.out.println(ret41);

        TreeNode node42 = new TreeNode(1);
        node42.left = new TreeNode(2);
        node42.right = new TreeNode(3);
        node42.left.left = new TreeNode(4);
        node42.left.right = new TreeNode(5);
        node42.right.left = new TreeNode(6);
        node42.right.right = new TreeNode(7);
        List<List<Integer>> ret42 = solution.verticalTraversal(node42);
        System.out.println(ret42);

    }
}
