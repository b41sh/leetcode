package leetcode.implementStrStr;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 28. Implement strStr()
 */
public class ImplementStrStrTest {
    @Test
    public void test() {

        System.out.println("ImplementStrStrTest");

        ImplementStrStr solution = new ImplementStrStr();

        String haystack = "";
        String needle = "";
        int ret = -1;

        haystack = "hello";
        needle = "ll";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

        haystack = "aaaaa";
        needle = "bba";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-1));

        haystack = "aaaaa";
        needle = "a";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        haystack = "";
        needle = "";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        haystack = "aaa";
        needle = "aaaa";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(-1));


        haystack = "mississippi";
        needle = "issip";
        ret = solution.strStr(haystack, needle);
        System.out.println("haystack=" + haystack + " needle=" + needle + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

    }
}