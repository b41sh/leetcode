package leetcode.firstMissingPositive;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 41. First Missing Positive
 */
public class FirstMissingPositiveTest {
    @Test
    public void test() {

        System.out.println("FirstMissingPositiveTest");

        FirstMissingPositive solution = new FirstMissingPositive();

        int[] nums = new int[]{1, 2, 0};
        int ret = 0;
        ret = solution.firstMissingPositive(nums);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        int[] nums1 = new int[]{3, 4, -1, 1};
        ret = solution.firstMissingPositive(nums1);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        int[] nums2 = new int[]{7,8,9,11,12};
        ret = solution.firstMissingPositive(nums2);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        int[] nums3 = new int[]{0, 1, 2, 3};
        ret = solution.firstMissingPositive(nums3);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        int[] nums4 = new int[]{1, 2, 3};
        ret = solution.firstMissingPositive(nums4);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

    }

}
