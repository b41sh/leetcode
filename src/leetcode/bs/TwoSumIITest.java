package leetcode.bs.twoSumII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 167. Two Sum II - Input array is sorted
 */
public class TwoSumIITest {
    @Test
    public void test() {

        System.out.println("TwoSumIITest");

        TwoSumII solution = new TwoSumII();

        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        int[] ret = solution.twoSum(numbers, target);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
        Assert.assertTrue(new Integer(ret[0]).equals(1));
        Assert.assertTrue(new Integer(ret[1]).equals(2));


        int[] numbers1 = new int[]{3,24,50,79,88,150,345};
        int target1 = 200;
        int[] ret1 = solution.twoSum(numbers1, target1);
        System.out.println(ret1[0]);
        System.out.println(ret1[1]);
        //Assert.assertTrue(new Integer(ret[0]).equals(1));
        //Assert.assertTrue(new Integer(ret[1]).equals(2));
    }
}
