package leetcode.array.kthLargestElementInAnArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 215. Kth Largest Element in an Array
 */
public class KthLargestElementInAnArrayTest {
    @Test
    public void test() {

        System.out.println("KthLargestElementInAnArrayTest");

        KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        int ret = solution.findKthLargest(nums, k);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        int[] nums1 = new int[]{3,2,3,1,2,4,5,5,6};
        int k1 = 4;
        int ret1 = solution.findKthLargest(nums1, k1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(4));

    }
}