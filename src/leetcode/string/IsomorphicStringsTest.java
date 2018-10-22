package leetcode.string.isomorphicStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 205. Isomorphic Strings
 */
public class IsomorphicStringsTest {
    @Test
    public void test() {

        System.out.println("IsomorphicStringsTest");

        IsomorphicStrings solution = new IsomorphicStrings();

        String s1 = "egg";
        String t1 = "add";
        boolean ret1 = solution.isIsomorphic(s1, t1);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        String s2 = "foo";
        String t2 = "bar";
        boolean ret2 = solution.isIsomorphic(s2, t2);
        System.out.println(ret2);
        Assert.assertTrue(new Boolean(ret2).equals(false));

        String s3 = "aa";
        String t3 = "ab";
        boolean ret3 = solution.isIsomorphic(s3, t3);
        System.out.println(ret3);
        Assert.assertTrue(new Boolean(ret3).equals(false));

    }
}

