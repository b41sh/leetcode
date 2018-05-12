package leetcode.zigZagConversion;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 6. ZigZag Conversion
 */
public class ZigZagConversionTest {
    @Test
    public void test() {

        System.out.println("ZigZagConversionTest");

        ZigZagConversion solution = new ZigZagConversion();

        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ret = solution.convert(s, numRows);
        System.out.println(ret);
        Assert.assertTrue(ret.equals("PAHNAPLSIIGYIR"));

        numRows = 4;
        ret = solution.convert(s, numRows);
        System.out.println(ret);
        Assert.assertTrue(ret.equals("PINALSIGYAHRPI"));
    }
}
