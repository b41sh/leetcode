package leetcode.multiplyStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 43. Multiply Strings
 */
public class MultiplyStringsTest {
    @Test
    public void test() {

        System.out.println("MultiplyStringsTest");

        MultiplyStrings solution = new MultiplyStrings();

        //String num1 = "1111111118888888";
        //String num2 = "20999999990430";
        String num1 = "0";
        String num2 = "0";
        String ret = "";

        ret = solution.multiply(num1, num2);
        System.out.println("ret=" + ret);
        //Assert.assertTrue(new Integer(ret).equals(6));
    }
}