package leetcode.longestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 14. Longest Common Prefix
 */
public class LongestCommonPrefixTest {
    @Test
    public void test() {

        System.out.println("LongestPalindromeTest");
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {"flower","flow","flight"};
        String ret = "";
        ret = solution.longestCommonPrefix(strs);
        Assert.assertTrue(ret.equals(new String("fl")));

        String[] strs1 = {"dog", "racecar", "car"};
        ret = solution.longestCommonPrefix(strs1);
        Assert.assertTrue(ret.equals(new String("")));
    }
}