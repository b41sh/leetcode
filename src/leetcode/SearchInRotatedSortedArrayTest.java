package leetcode.searchInRotatedSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 33. Search in Rotated Sorted Array
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void test() {

        System.out.println("SearchInRotatedSortedArrayTest");

        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        int ret = 0;
        ret = solution.search(nums, target);
        System.out.println("target =" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-1));

        target = 0;
        ret = solution.search(nums, target);
        System.out.println("target =" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        int[] nums1 = new int[]{1};
        target = 1;
        ret = solution.search(nums1, target);
        System.out.println("target =" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

    }
}
