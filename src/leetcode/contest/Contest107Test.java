package leetcode.contest.contest107;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 107
 */
public class Contest107Test {
    @Test
    public void test() {

        System.out.println("Contest107Test");

        Contest107 solution = new Contest107();

        boolean ret1 = false;
        String name1 = "alex";
        String typed1 = "aaleex";
        ret1 = solution.isLongPressedName(name1, typed1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        String name2 = "saeed";
        String typed2 = "ssaaedd";
        ret1 = solution.isLongPressedName(name2, typed2);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Boolean(ret1).equals(false));

        String name3 = "leelee";
        String typed3 = "lleeelee";
        ret1 = solution.isLongPressedName(name3, typed3);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        String name4 = "laiden";
        String typed4 = "laiden";
        ret1 = solution.isLongPressedName(name4, typed4);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        int ret2 = 0;

        String S1 = "00110";
        ret2 = solution.minFlipsMonoIncr(S1);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));

        String S2 = "010110";
        ret2 = solution.minFlipsMonoIncr(S2);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(2));

        String S3 = "00011000";
        ret2 = solution.minFlipsMonoIncr(S3);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(2));


        int[] ret3 = new int[2];

        int[] A1 = new int[]{1,0,1,0,1};
        ret3 = solution.threeEqualParts(A1);
        System.out.println("ret3[0]=" + ret3[0]);
        System.out.println("ret3[1]=" + ret3[1]);
        Assert.assertTrue(new Integer(ret3[0]).equals(0));
        Assert.assertTrue(new Integer(ret3[1]).equals(3));

        int[] A2 = new int[]{1,1,0,1,1};
        ret3 = solution.threeEqualParts(A2);
        System.out.println("ret3[0]=" + ret3[0]);
        System.out.println("ret3[1]=" + ret3[1]);
        Assert.assertTrue(new Integer(ret3[0]).equals(-1));
        Assert.assertTrue(new Integer(ret3[1]).equals(-1));

    }
}
