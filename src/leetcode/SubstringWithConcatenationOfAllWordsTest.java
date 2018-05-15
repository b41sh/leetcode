package leetcode.substringWithConcatenationOfAllWords;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 30. Substring with Concatenation of All Words
 */
public class SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void test() {

        System.out.println("SubstringWithConcatenationOfAllWords");

        SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();

        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        List<Integer> ret = solution.findSubstring(s, words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("s=" + s + " ret=" + ret);

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "good"};

        for (int j = 0; j < words2.length; j++) {
            System.out.println(words2[j]);
        }
        List<Integer> ret2 = solution.findSubstring(s2, words2);
        System.out.println("s=" + s2 + " ret=" + ret2);

    }
}
