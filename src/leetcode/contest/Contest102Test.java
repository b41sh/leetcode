package leetcode.contest.contest102;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 102
 */
public class Contest102Test {
    @Test
    public void test() {

        System.out.println("Contest102Test");

        Contest102 solution = new Contest102();

        int[] tree = new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int ret1 = solution.totalFruit(tree);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(5));

        int[] tree1 = new int[]{3, 3, 3, 3, 3, 3};
        ret1 = solution.totalFruit(tree1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(6));

        int[] tree2 = new int[]{1, 2, 1};
        ret1 = solution.totalFruit(tree2);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(3));

        int[] tree3 = new int[]{0, 1, 6, 6, 4, 4, 6};
        ret1 = solution.totalFruit(tree3);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(5));

        int[] A = new int[]{3, 1, 2, 4};
        int[] ret2 = solution.sortArrayByParity(A);
        //System.out.println("ret2=" + ret2);
        for (int i = 0; i < ret2.length; i++) {
            System.out.print(ret2[i] + " ");
        }
        System.out.println("");

        int x = Integer.MAX_VALUE;
        System.out.println("x= " + x);

    }
}
