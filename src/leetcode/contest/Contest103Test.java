package leetcode.contest.contest103;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 103
 */
public class Contest103Test {
    @Test
    public void test() {

        System.out.println("Contest103Test");

        Contest103 solution = new Contest103();

        int[] A21 = new int[]{1};
        int K21 = 0;
        int ret21 = 0;
        ret21 = solution.smallestRangeI(A21, K21);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(0));

        int[] A22 = new int[]{0, 10};
        int K22 = 2;
        ret21 = solution.smallestRangeI(A22, K22);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(6));

        int[] A23 = new int[]{1, 3, 6};
        int K23 = 3;
        ret21 = solution.smallestRangeI(A23, K23);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(0));


        ret21 = solution.smallestRangeII(A21, K21);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(0));

        ret21 = solution.smallestRangeII(A22, K22);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(6));

        ret21 = solution.smallestRangeII(A23, K23);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(3));

        int[] A24 = new int[]{3,1,10};
        int K24 = 4;
        ret21 = solution.smallestRangeII(A24, K24);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(2));

        int[] A25 = new int[]{4,1,8,10};
        int K25 = 3;
        ret21 = solution.smallestRangeII(A25, K25);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(3));

        int[] A26 = new int[]{9,10,5,9};
        int K26 = 5;
        ret21 = solution.smallestRangeII(A26, K26);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(5));

        int[] A27 = new int[]{4,8,2,7,2};
        int K27 = 5;
        ret21 = solution.smallestRangeII(A27, K27);
        System.out.println("ret21=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(6));



    }
}
