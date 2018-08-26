package leetcode.contest.contest99;

import java.util.List;
import leetcode.TreeNode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 99
 */
public class Contest99Test {
    @Test
    public void test() {

        System.out.println("Contest99Test");

        Contest99 solution = new Contest99();

        int[][] grid = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int ret = solution.surfaceArea(grid);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(32));

        int[][] grid2 = new int[][]{{2,2,2},{2,1,2},{2,2,2}};
        int ret2 = solution.surfaceArea(grid2);
        System.out.println("ret=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(46));

        int N = 7;
        List<TreeNode> ret3 = solution.allPossibleFBT(N);
        System.out.println(ret3.size());
        Assert.assertTrue(new Integer(ret3.size()).equals(5));

        String[] A = new String[]{"abcd","cdab","adcb","cbad"};
        int num = solution.numSpecialEquivGroups(A);
        System.out.println(num);
        Assert.assertTrue(new Integer(num).equals(1));

    }
}

