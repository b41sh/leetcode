package leetcode.bs.searchInRotatedSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 33. Search in Rotated Sorted Array
 * Test for 81. Search in Rotated Sorted Array II
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



        //int[] nums21 = new int[] {2,5,6,0,0,1,2};
        int[] nums21 = new int[] {2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2};
        target = 0;
        boolean ret2 = false;
        ret2 = solution.searchII(nums21, target);
        System.out.println("target =" + target + " ret=" + ret2);
        Assert.assertTrue(new Boolean(ret2).equals(true));

        target = 3;
        ret2 = solution.searchII(nums21, target);
        System.out.println("target =" + target + " ret=" + ret2);
        Assert.assertTrue(new Boolean(ret2).equals(false));

        int[] nums22 = new int[] {1,1,3,1};
        target = 3;
        ret2 = solution.searchII(nums22, target);
        System.out.println("target =" + target + " ret=" + ret2);
        Assert.assertTrue(new Boolean(ret2).equals(true));

    }
}
