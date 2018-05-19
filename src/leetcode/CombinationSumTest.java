package leetcode.combinationSum;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 39. Combination Sum
 * Test for 40. Combination Sum II
 */
public class CombinationSumTest {
    @Test
    public void test() {

        System.out.println("CombinationSumTest");

        CombinationSum solution = new CombinationSum();

        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ret = solution.combinationSum(candidates, target);
        System.out.println(ret);

        int[] candidates2 = new int[]{2, 5, 2, 1, 2};
        int target2 = 5;
        List<List<Integer>> ret2 = solution.combinationSum2(candidates2, target2);
        System.out.println(ret2);

    }
}
