package leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 17. Letter Combinations of a Phone Number
 */
public class LetterCombinationsTest {
    @Test
    public void test() {

        System.out.println("LetterCombinationsTest");
        LetterCombinations solution = new LetterCombinations();

        String digits = "999";
        List<String> ret = new ArrayList<String>();

        ret = solution.letterCombinations(digits);
        System.out.println(ret);
    }
}