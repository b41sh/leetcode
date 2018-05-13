package leetcode.stringToInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 8. String to Integer (atoi)
 */
public class StringToIntegerTest {
    @Test
    public void test() {

        System.out.println("StringToIntegerTest");

        StringToInteger solution = new StringToInteger();

        String str = "";
        int ret = 0;

        str = "42";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(42));

        str = "   -42";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-42));

        str = "4193 with words";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4193));

        str = "words and 987";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        str = "91283472332";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2147483647));

        str = "-91283472332";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-2147483648));

        str = "-2147483649";
        ret = solution.myAtoi(str);
        System.out.println("str=" + str + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-2147483648));


    }
}
