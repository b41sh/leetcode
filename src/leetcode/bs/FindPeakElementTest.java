package leetcode.bs.findPeakElement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 162. Find Peak Element
 */
public class FindPeakElementTest {
    @Test
    public void test() {

        System.out.println("FindPeakElementTest");

        FindPeakElement solution = new FindPeakElement();

        int ret;
        int[] nums1 = new int[]{1, 2, 3, 1};
        ret = solution.findPeakElement(nums1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        int[] nums2 = new int[]{1, 2, 1, 3, 5, 6, 4};
        ret = solution.findPeakElement(nums2);
        System.out.println(ret);
        //Assert.assertTrue(new Integer(ret).equals(1));

        int[] nums3 = new int[]{1,2,3,4,5};
        ret = solution.findPeakElement(nums3);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        int[] nums4 = new int[]{2,1};
        ret = solution.findPeakElement(nums4);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(0));
    }
}
