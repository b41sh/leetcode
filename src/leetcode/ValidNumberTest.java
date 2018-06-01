package leetcode.validNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 65. Valid Number
 */
public class ValidNumberTest {

    @Test
    public void test() {

        System.out.println("ValidNumberTest");

        ValidNumber solution = new ValidNumber();

        String s = "";
        boolean ret = false;

        s = "0";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = " 0.1";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "abc";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "1 a";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "2e10";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = ".1";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "3.";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = ".";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "-1.";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "+.8";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "46.e3";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = ".e";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = ".e1";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = ".2e81";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "e9";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = " 005047e+6";
        ret = solution.isNumber(s);
        System.out.println("s=" + s + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
