package leetcode.permutationSequence;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 60. Permutation Sequence
 */
public class PermutationSequenceTest {

    @Test
    public void test() {

        System.out.println("PermutationSequenceTest");

        PermutationSequence solution = new PermutationSequence();

        int n = 4;
        int k = 1;
        String ret = "";
        for (; k <= 24; k++) {
            ret = solution.getPermutation(n, k);
            System.out.println("k=" + k + " ret=" + ret);
        }
        //Assert.assertTrue(ret.equals("123"));

    }
}