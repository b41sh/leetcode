package leetcode.dp.maximumProductSubarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 152. Maximum Product Subarray
 */
public class MaximumProductSubarrayTest {
    @Test
    public void test() {

        System.out.println("MaximumProductSubarrayTest");

        MaximumProductSubarray solution = new MaximumProductSubarray();

        int[] nums1 = new int[]{2,3,-2,4};
        int ret1 = solution.maxProduct(nums1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(6));

        int[] nums2 = new int[]{-2,0,-1};
        int ret2 = solution.maxProduct(nums2);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(0));

        int[] nums3 = new int[]{-2};
        int ret3 = solution.maxProduct(nums3);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(-2));

        int[] nums4 = new int[]{2,-5,-2,-4,3};
        int ret4 = solution.maxProduct(nums4);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(24));

        int[] nums5 = new int[]{2,0};
        int ret5 = solution.maxProduct(nums5);
        System.out.println(ret5);
        //Assert.assertTrue(new Integer(ret3).equals(-2));

    }
}

