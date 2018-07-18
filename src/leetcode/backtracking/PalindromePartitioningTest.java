package leetcode.backtracking.palindromePartitioning;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 131. Palindrome Partitioning
 */
public class PalindromePartitioningTest {
    @Test
    public void test() {

        System.out.println("PalindromePartitioningTest");

        PalindromePartitioning solution = new PalindromePartitioning();

        String s = "aab";
        List<List<String>> list = solution.partition(s);
        System.out.println(list);


        String s1 = "aaabbaa";
        List<List<String>> list1 = solution.partition(s1);
        System.out.println(list1);


        String s2 = "abcdefgh";
        List<List<String>> list2 = solution.partition(s2);
        System.out.println(list2);
    }
}
