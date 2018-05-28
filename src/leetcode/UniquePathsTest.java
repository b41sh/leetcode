package leetcode.uniquePaths;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 62. Unique Paths
 * Test for 63. Unique Paths II
 * Test for 64. Minimum Path Sum
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
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}};

        int[][] obstacleGrid2 = new int[][]{
            {0,0},{1,1},{0,0}};

        ret = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println("ret=" + ret);

        //int[][] grid = new int[][]{
        //    {1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = new int[][]{
            {1},{2},{3}};

        ret = solution.minPathSum(grid);
        System.out.println("ret=" + ret);

    }
}