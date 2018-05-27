package leetcode.uniquePaths;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 62. Unique Paths
 * Test for 63. Unique Paths II
 */
public class UniquePathsTest {

    @Test
    public void test() {

        System.out.println("UniquePathsTest");

        UniquePaths solution = new UniquePaths();

        int m = 7;
        int n = 3;
        int ret = 0;
        ret = solution.uniquePaths(m, n);
        System.out.println("ret=" + ret);


        int[][] obstacleGrid = new int[][]{
            {0,0},{1,1},{0,0}};
            //{0, 0, 0},
            //{0, 1, 0},
            //{0, 0, 0}};


        ret = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println("ret=" + ret);

    }
}