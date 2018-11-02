package leetcode.bit.bitwiseAndOfNumbersRange;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 201. Bitwise AND of Numbers Range
 */
public class BitwiseAndOfNumbersRangeTest {
    @Test
    public void test() {

        System.out.println("BitwiseAndOfNumbersRangeTest");

        BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

        int m = 3;
        int n = 7;
        int ret = solution.rangeBitwiseAnd(m, n);
        System.out.println("ret=" + ret);


    }
}
