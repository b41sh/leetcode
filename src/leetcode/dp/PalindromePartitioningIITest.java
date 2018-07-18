package leetcode.dp.palindromePartitioningII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 132. Palindrome Partitioning II
 */
public class PalindromePartitioningIITest {
    @Test
    public void test() {

        System.out.println("PalindromePartitioningIITest");

        PalindromePartitioningII solution = new PalindromePartitioningII();

        String s = "aab";
        int ret = solution.minCut0(s);
        System.out.println(ret);
        ret = solution.minCut(s);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        String s1 = "aaabbaa";
        int ret1 = solution.minCut0(s1);
        System.out.println(ret1);
        ret1 = solution.minCut(s1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(1));


        String s2 = "abcdefgh";
        int ret2 = solution.minCut0(s2);
        System.out.println(ret2);
        ret2 = solution.minCut(s2);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(7));

        String s3 = "fifgbeajcacehiicccfecbfhhgfiiecdcjjffbghdidbhbdbfbfjccgbbdcjheccfbhafehieabbdfeigbiaggchaeghaijfbjhi";
        //int ret3 = solution.minCut0(s3);
        //System.out.println(ret3);
        int ret3 = solution.minCut(s3);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(75));

        String s4 = "abbab";
        int ret4 = solution.minCut(s4);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(1));

        String s5 = "cabababcbc";
        int ret5 = solution.minCut(s5);
        System.out.println(ret5);
        Assert.assertTrue(new Integer(ret5).equals(3));

        String s6 = "cbbbcc";
        int ret6 = solution.minCut(s6);
        System.out.println(ret6);
        Assert.assertTrue(new Integer(ret6).equals(1));

        String s7 = "aabaaaaaa";
        int ret7 = solution.minCut(s7);
        System.out.println(ret7);
        Assert.assertTrue(new Integer(ret7).equals(1));
    }
}

/**
abcdeffedcba
012345543210

abcdefffedcba
0123455543210

abcdefxfedcba
0123456543210


dp[0] = 0
dp[1] = 1
dp[2] = 0
dp[3] = 3
dp[4] = 4
dp[5] = 5  fifgbe



        f -> 0
fi -> 1
fif -> 0
fifg -> 1
fifgb -> 2
fifgbe -> 3

fifgbeajcac
0123456789

a aabaa
*/
