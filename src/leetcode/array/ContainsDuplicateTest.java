package leetcode.array.containsDuplicate;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 217. Contains Duplicate
 */
public class ContainsDuplicateTest {
    @Test
    public void test() {

        System.out.println("ContainsDuplicateTest");

        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums = new int[]{1,2,3,1};
        boolean ret = solution.containsDuplicate(nums);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        int[] nums1 = new int[]{1,2,3,4};
        boolean ret1 = solution.containsDuplicate(nums1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Boolean(ret1).equals(false));

    }
}