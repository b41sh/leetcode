package leetcode.findMedianSortedArrays;


import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 04. Find Median Sorted Arrays
 */
public class FindMedianSortedArraysTest {
    @Test
    public void test() {

        System.out.println("FindMedianSortedArraysTest");

        FindMedianSortedArrays solution = new FindMedianSortedArrays();

        int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] nums2 = new int[] {3, 4};

        double ret = solution.findMedianSortedArrays(nums1, nums2);

        System.out.println(ret);
        Assert.assertTrue(new Double(ret).equals(5.5));
    }
}
