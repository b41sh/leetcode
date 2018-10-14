package leetcode.bs.findMinimumInRotatedSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 153. Find Minimum in Rotated Sorted Array
 * Test for 154. Find Minimum in Rotated Sorted Array II
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

        int[] nums3 = new int[]{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3, 4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4, 5,5,5,5,5,5,5,5,5,5,5,5,5, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1, 2};
        int ret3 = solution.findMinII(nums3);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(1));

        int[] nums4 = new int[]{4, 5, 6, 7, 0, 1, 2};
        int ret4 = solution.findMinII(nums4);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(0));

    }
}
