package leetcode.countAndSay;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 38. Count and Say
 */
public class CountAndSayTest {
    @Test
    public void test() {

        System.out.println("CountAndSayTest");

        CountAndSay solution = new CountAndSay();

        int n = 1;
        String ret = "";

/**
1 1
2 11
3 21
4 1211
5 111221
6 312211
7 13112221
8 1113213211
9 31131211131221
*/

        n = 1;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("1"));

        n = 2;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("11"));

        n = 3;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("21"));

        n = 4;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("1211"));

        n = 5;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("111221"));

        n = 6;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("312211"));

        n = 7;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("13112221"));

        n = 8;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("1113213211"));

        n = 9;
        ret = solution.countAndSay(n);
        System.out.println("n=" + n + "ret=" + ret);
        Assert.assertTrue(ret.equals("31131211131221"));

    }
}
