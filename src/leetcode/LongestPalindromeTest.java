package leetcode.longestPalindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 05. Longest Palindrome
 */
public class LongestPalindromeTest {
    @Test
    public void test() {

        System.out.println("LongestPalindromeTest");
        LongestPalindrome solution = new LongestPalindrome();

        String s = "";
        String ret = "";
        s = "cbbd";
        ret = solution.longestPalindrome(s);
        System.out.println("string is " + s + " ret string is " + ret);
        Assert.assertTrue(ret.equals(new String("bb")));

        s = "ccc";
        ret = solution.longestPalindrome(s);
        System.out.println("string is " + s + " ret string is " + ret);
        Assert.assertTrue(ret.equals(new String("ccc")));

    }
}
