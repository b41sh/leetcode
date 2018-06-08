package leetcode.backtracking.combinations;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 77. Combinations
 */
public class CombinationsTest {
    @Test
    public void test() {

        System.out.println("CombinationsTest");

        Combinations solution = new Combinations();

        int n = 0;
        int k = 0;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        n = 4;
        k = 2;
        ret = solution.combine(n, k);
        System.out.println(ret);

        n = 20;
        k = 2;
        ret = solution.combine(n, k);
        System.out.println(ret);
    }
}
