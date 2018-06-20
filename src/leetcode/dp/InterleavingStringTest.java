package leetcode.dp.interleavingString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 97. Interleaving String Test
 */
public class InterleavingStringTest {
    @Test
    public void test() {

        System.out.println("InterleavingStringTest");

        InterleavingString solution = new InterleavingString();

        /**
          aadbbcbcac
          # d b b c a
        # 0 0 0 0 0 0
        a 1 0 0 0 0 0
        a 1 1 1 1 1 0
        b 0 1 1 0 1 0
        c 0 0 1 0 1 1
        c 0 0 0 0 0 1
        */

        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean ret = false;

        ret = solution.isInterleave(s1, s2, s3);
        System.out.println("s1=" + s1 + " s2=" + s2 + " s3=" + s3 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s1 = "aabcc";
        s2 = "dbbca";
        s3 = "aadbbbaccc";
        ret = solution.isInterleave(s1, s2, s3);
        System.out.println("s1=" + s1 + " s2=" + s2 + " s3=" + s3 + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

    }
}
