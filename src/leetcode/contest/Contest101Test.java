package leetcode.contest.contest101;

import java.util.List;
import leetcode.TreeNode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 101
 */
public class Contest101Test {
    @Test
    public void test() {

        System.out.println("Contest101Test");

        Contest101 solution = new Contest101();


        int[] A = new int[]{3,8,0,9,2,5};
        Contest101.RLEIterator rleIterator = new Contest101().new RLEIterator(A);
        int ret1 = 0;
        ret1 = rleIterator.next(2);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(8));

        ret1 = rleIterator.next(1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(8));

        ret1 = rleIterator.next(1);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(5));

        ret1 = rleIterator.next(2);
        System.out.println(ret1);
        Assert.assertTrue(new Integer(ret1).equals(-1));

        Contest101.StockSpanner stockSpanner = new Contest101().new StockSpanner();

        int ret2 = 0;
        ret2 = stockSpanner.next(100);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));
        ret2 = stockSpanner.next(80);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));
        ret2 = stockSpanner.next(60);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));
        ret2 = stockSpanner.next(70);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(2));
        ret2 = stockSpanner.next(60);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));
        ret2 = stockSpanner.next(75);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(4));
        ret2 = stockSpanner.next(85);
        System.out.println(ret2);
        Assert.assertTrue(new Integer(ret2).equals(6));


        int ret3 = 0;
        String[] D = new String[]{"1", "3", "5"};
        int N = 1234567;
        ret3 = solution.atMostNGivenDigitSet(D, N);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(1335));

        String[] D1 = new String[]{"1","3","5","7"};
        int N1 = 100;
        ret3 = solution.atMostNGivenDigitSet(D1, N1);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(20));

        String[] D2 = new String[]{"1", "4", "9"};
        int N2 = 1000000000;
        ret3 = solution.atMostNGivenDigitSet(D2, N2);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(29523));

        int ret4 = 0;
        String S = "DID";
        ret4 = solution.numPermsDISequence(S);
        System.out.println(ret4);

        String S1 = "IDDDIIDIIIIIIIIDIDID";
        ret4 = solution.numPermsDISequence(S1);
        System.out.println(ret4);

    }
}
