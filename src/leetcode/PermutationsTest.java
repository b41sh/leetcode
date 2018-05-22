package leetcode.permutations;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 46. Permutations
 * Test for 47. Permutations II
 */
public class PermutationsTest {

    @Test
    public void test() {

        System.out.println("PermutationsTest");

        Permutations solution = new Permutations();

        int[] nums = new int[] {1,2,3, 4};
        List<List<Integer>> ret = solution.permute(nums);
        System.out.println(ret);


        int[] nums2 = new int[] {1,1,2};
        List<List<Integer>> ret2 = solution.permuteII(nums2);
        System.out.println(ret2);
    }
}