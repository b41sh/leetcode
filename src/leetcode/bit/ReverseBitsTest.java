package leetcode.bit.reverseBits;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 190. Reverse Bits
 */
public class ReverseBitsTest {

    @Test
    public void test() {

        System.out.println("ReverseBitsTest");

        ReverseBits solution = new ReverseBits();

        int n = 43261596;
        int ret = solution.reverseBits(n);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(964176192));
    }
}
