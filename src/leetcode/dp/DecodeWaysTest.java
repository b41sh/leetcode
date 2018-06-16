package leetcode.dp.decodeWays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 91. Decode Ways
 */
public class DecodeWaysTest {
    @Test
    public void test() {

        System.out.println("DecodeWaysTest");

        DecodeWays solution = new DecodeWays();


        String s1 = "12";
        int ret = 0;
        ret = solution.numDecodings(s1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        String s2 = "226";
        ret = solution.numDecodings(s2);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        String s3 = "10";
        ret = solution.numDecodings(s3);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        String s4 = "0";
        ret = solution.numDecodings(s4);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        String s5 = "17";
        ret = solution.numDecodings(s5);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        String s6 = "1212";
        ret = solution.numDecodings(s6);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        String s7 = "27";
        ret = solution.numDecodings(s7);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        String s8 = "12121212121212121212121212";
        ret = solution.numDecodings(s8);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(196418));

    }
}

