package leetcode.twoSum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 01. Two Sum
 */
public class TwoSumTest {
    @Test
    public void test() {

        System.out.println("TwoSumTest");

        TwoSum solution = new TwoSum();

        int[] nums = new int[10];
        int target = 10;
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 9;

        int[] ret = solution.twoSum(nums, target);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
        Assert.assertTrue(new Integer(ret[0]).equals(0));
        Assert.assertTrue(new Integer(ret[1]).equals(3));
    }
}
