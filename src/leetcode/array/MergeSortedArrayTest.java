package leetcode.array.mergeSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 88. Merge Sorted Array
 */
public class MergeSortedArrayTest {
    @Test
    public void test() {

        System.out.println("MergeSortedArrayTest");

        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("\n");

    }
}