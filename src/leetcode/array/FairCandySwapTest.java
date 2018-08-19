package leetcode.array.fairCandySwap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 888. Fair Candy Swap
 */
public class FairCandySwapTest {
    @Test
    public void test() {

        System.out.println("FairCandySwapTest");

        FairCandySwap solution = new FairCandySwap();

        int[] A1 = new int[]{1,1};
        int[] B1 = new int[]{2,2};
        int[] ans1 = solution.fairCandySwap(A1, B1);
        System.out.println(ans1[0] + "  " + ans1[1]);

        int[] A2 = new int[]{2};
        int[] B2 = new int[]{1,3};
        int[] ans2 = solution.fairCandySwap(A2, B2);
        System.out.println(ans2[0] + "  " + ans2[1]);

        int[] A3 = new int[]{1,2,5};
        int[] B3 = new int[]{2,4};
        int[] ans3 = solution.fairCandySwap(A3, B3);
        System.out.println(ans3[0] + "  " + ans3[1]);

    }
}