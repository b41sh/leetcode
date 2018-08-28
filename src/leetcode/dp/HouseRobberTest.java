package leetcode.dp.houseRobber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 198. House Robber
 */
public class HouseRobberTest {
    @Test
    public void test() {

        System.out.println("HouseRobberTest");

        HouseRobber solution = new HouseRobber();

        int[] nums1 = new int[]{1, 2, 3, 1};
        int ret1 = solution.rob(nums1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(4));

        int[] nums2 = new int[]{2, 7, 9, 3, 1};
        int ret2 = solution.rob(nums2);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(12));


        int[] nums3 = new int[]{2, 3, 2};
        int ret3 = solution.robII(nums3);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(3));

        int[] nums4 = new int[]{1, 2, 3, 1};
        int ret4 = solution.robII(nums4);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(4));

        int[] nums5 = new int[]{1};
        int ret5 = solution.robII(nums5);
        System.out.println(ret5);
        Assert.assertTrue(new Integer(ret5).equals(1));

        int[] nums6 = new int[]{2, 1, 1, 2};
        int ret6 = solution.robII(nums6);
        System.out.println(ret6);
        Assert.assertTrue(new Integer(ret6).equals(3));

        int[] nums7 = new int[]{1,1,1,2};
        int ret7 = solution.robII(nums7);
        System.out.println(ret7);
        Assert.assertTrue(new Integer(ret7).equals(3));


    }
}
