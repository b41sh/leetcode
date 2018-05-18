package leetcode.searchInsertPosition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 35. Search Insert Position
 */
public class SearchInsertPositionTest {
    @Test
    public void test() {

        System.out.println("SearchInsertPositionTest");

        SearchInsertPosition solution = new SearchInsertPosition();

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;
        int ret = 0;

        target = 5;
        ret = solution.searchInsert(nums, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        target = 2;
        ret = solution.searchInsert(nums, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        target = 7;
        ret = solution.searchInsert(nums, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        target = 0;
        ret = solution.searchInsert(nums, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        int[] nums1 = new int[]{2};
        target = 2;
        ret = solution.searchInsert(nums1, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        target = 1;
        ret = solution.searchInsert(nums1, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        target = 3;
        ret = solution.searchInsert(nums1, target);
        System.out.println("target=" + target + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1));
    }
}
