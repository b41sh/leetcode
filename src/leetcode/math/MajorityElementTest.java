package leetcode.math.majorityElement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 169. Majority Element
 */
public class MajorityElementTest {
    @Test
    public void test() {

        System.out.println("MajorityElementTest");

        MajorityElement solution = new MajorityElement();

        int nums[] = new int[]{2,2,1,1,1,2,2};
        int ret = solution.majorityElement(nums);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));
    }
}
