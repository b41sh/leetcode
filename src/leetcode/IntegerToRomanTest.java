package leetcode.integerToRoman;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 12. Integer to Roman
 */
public class IntegerToRomanTest {
    @Test
    public void test() {

        System.out.println("IntegerToRomanTest");

        IntegerToRoman solution = new IntegerToRoman();

        int num = 0;
        String roman = "";

        num = 3;
        roman = solution.intToRoman(num);
        System.out.println("num=" + num + " roman=" + roman);
        Assert.assertTrue(roman.equals("III"));

        num = 4;
        roman = solution.intToRoman(num);
        System.out.println("num=" + num + " roman=" + roman);
        Assert.assertTrue(roman.equals("IV"));

        num = 9;
        roman = solution.intToRoman(num);
        System.out.println("num=" + num + " roman=" + roman);
        Assert.assertTrue(roman.equals("IX"));

        num = 58;
        roman = solution.intToRoman(num);
        System.out.println("num=" + num + " roman=" + roman);
        Assert.assertTrue(roman.equals("LVIII"));

        num = 1994;
        roman = solution.intToRoman(num);
        System.out.println("num=" + num + " roman=" + roman);
        Assert.assertTrue(roman.equals("MCMXCIV"));



    }
}