package leetcode.bit.singleNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 136. Single Number
 * Test for 137. Single Number II
 */
public class SingleNumberTest {

    @Test
    public void test() {

        System.out.println("SingleNumberTest");

        SingleNumber solution = new SingleNumber();

        int[] nums = {2, 2, 1};
        int ret = 0;

        ret = solution.singleNumber(nums);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        int[] nums1 = {4, 1, 2, 1, 2};
        ret = solution.singleNumber(nums1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(4));



        int[] numsII = {2, 2, 3, 2};
        ret = solution.singleNumberII(numsII);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        int[] numsII2 = {0,1,0,1,0,1,99};
        ret = solution.singleNumberII(numsII2);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(99));
    }
}
