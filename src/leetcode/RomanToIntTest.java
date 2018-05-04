package leetcode.romanToInt;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 13. Roman to Integer
 */
public class RomanToIntTest {
    @Test
    public void test() {

        System.out.println("RomanToIntTest");

        RomanToInt solution = new RomanToInt();

        String s = "";
        int ret = 0;

        s = "III";
        ret = solution.romanToInt(s);
        System.out.println("string =" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        s = "IV";
        ret = solution.romanToInt(s);
        System.out.println("string =" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        s = "LVIII";
        ret = solution.romanToInt(s);
        System.out.println("string =" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(58));

        s = "MCMXCIV";
        ret = solution.romanToInt(s);
        System.out.println("string =" + s + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1994));
    }
}
