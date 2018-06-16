package leetcode.backtracking.subsets;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 78. Subsets
 */
public class SubsetsTest {
    @Test
    public void test() {

        System.out.println("SubsetsTest");

        Subsets solution = new Subsets();

        int[] nums = {1,2,3};
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        ret = solution.subsets(nums);
        System.out.println(ret);

        System.out.println("==============");

        nums = new int[]{1, 2, 2};
        ret = solution.subsetsWithDup(nums);
        System.out.println(ret);
    }
}
