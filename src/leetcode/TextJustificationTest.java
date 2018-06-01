package leetcode.textJustification;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 68. Text Justification
 */
public class TextJustificationTest {

    @Test
    public void test() {

        System.out.println("TextJustificationTest");

        TextJustification solution = new TextJustification();

        int maxWidth = 16;
        String[] words1 = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        List<String> ret1 = solution.fullJustify(words1, maxWidth);
        for (String s : ret1) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        String[] words2 = new String[]{"What","must","be","acknowledgment","shall","be"};
        List<String> ret2 = solution.fullJustify(words2, maxWidth);
        for (String s : ret2) {
            System.out.println(s);
        }
    }
}
