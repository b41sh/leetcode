package leetcode.climbingStairs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 70. Climbing Stairs
 */
public class ClimbingStairsTest {

    @Test
    public void test() {

        System.out.println("ClimbingStairsTest");

        ClimbingStairs solution = new ClimbingStairs();

        /**
            1 1 1 1
            1 2 1
            1 1 2
            2 1 1
            2 2
        */
        int n = 4;
        int ret = 0;
        ret = solution.climbStairs(n);
        System.out.println("n=" + n + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(5));
    }
}