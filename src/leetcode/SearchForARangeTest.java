package leetcode.searchForARange;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 34. Search for a Range
 */
public class SearchForARangeTest {
    @Test
    public void test() {

        System.out.println("SearchForARangeTest");

        SearchForARange solution = new SearchForARange();

        int[] nums = new int[]{5,7,7,8,8,8,8,8,8,8,8,8,8,10};
        int target = 8;
        int[] ret = new int[]{-1, -1};
        ret = solution.searchRange(nums, target);
        System.out.println("target=" + target + " ret[0]=" + ret[0] + " ret[1]=" + ret[1]);
        Assert.assertTrue(new Integer(ret[0]).equals(3));
        Assert.assertTrue(new Integer(ret[1]).equals(12));

        int[] nums1 = new int[]{};
        target = 0;
        ret = solution.searchRange(nums1, target);
        System.out.println("target=" + target + " ret[0]=" + ret[0] + " ret[1]=" + ret[1]);
        Assert.assertTrue(new Integer(ret[0]).equals(-1));
        Assert.assertTrue(new Integer(ret[1]).equals(-1));

    }
}
