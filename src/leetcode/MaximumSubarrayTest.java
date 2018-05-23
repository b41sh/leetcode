package leetcode.maximumSubarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 53. Maximum Subarray
 */
public class MaximumSubarrayTest {
    @Test
    public void test() {

        System.out.println("MaximumSubarrayTest");

        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int ret;
        ret = solution.maxSubArray(nums);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(6));
    }
}