package leetcode.bs.findMinimumInRotatedSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 153. Find Minimum in Rotated Sorted Array
 */
public class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void test() {

        System.out.println("FindMinimumInRotatedSortedArrayTest");

        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

        int[] nums1 = new int[]{3, 4, 5, 1, 2};
        int ret1 = solution.findMin(nums1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(1));

        int[] nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        int ret2 = solution.findMin(nums2);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(0));

    }
}
