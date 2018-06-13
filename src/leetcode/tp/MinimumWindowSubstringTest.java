package leetcode.tp.minimumWindowSubstring;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 76. Minimum Window Substring
 */
public class MinimumWindowSubstringTest {
    @Test
    public void test() {

        System.out.println("MinimumWindowSubstringTest");

        MinimumWindowSubstring solution = new MinimumWindowSubstring();

        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ret = "";
        ret = solution.minWindow(s, t);
        System.out.println(ret);
        Assert.assertTrue(ret.equals("BANC"));


        String s1 = "ADOBECODEBANC";
        String t1 = "A";
        String ret1 = "";
        ret1 = solution.minWindow(s1, t1);
        System.out.println(ret1);
        Assert.assertTrue(ret1.equals("A"));

    }
}