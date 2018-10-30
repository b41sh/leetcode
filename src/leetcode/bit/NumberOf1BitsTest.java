package leetcode.bit.numberOf1Bits;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 191. Bits Number of 1 Bits
 */
public class NumberOf1BitsTest {

    @Test
    public void test() {

        System.out.println("NumberOf1BitsTest");

        NumberOf1Bits solution = new NumberOf1Bits();

        int n = 11;
        int ret = solution.hammingWeight(n);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));
    }
}
