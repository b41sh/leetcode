package leetcode.bit.repeatedDnaSequences;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test for 187. Repeated DNA Sequences
 */
public class RepeatedDnaSequencesTest {
    @Test
    public void test() {

        System.out.println("RepeatedDnaSequencesTest");

        RepeatedDnaSequences solution = new RepeatedDnaSequences();

        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ret = solution.findRepeatedDnaSequences(s);
        System.out.println("------------");
        for (String l : ret) {
            System.out.println(l);
        }

        String s1 = "AAAAAAAAAAAA";
        List<String> ret1 = solution.findRepeatedDnaSequences(s1);
        System.out.println("------------");
        for (String l : ret1) {
            System.out.println(l);
        }

        List<String> ret2 = solution.findRepeatedDnaSequences2(s);
        System.out.println("------------");
        for (String l : ret2) {
            System.out.println(l);
        }

        List<String> ret3 = solution.findRepeatedDnaSequences2(s1);
        System.out.println("------------");
        for (String l : ret3) {
            System.out.println(l);
        }
    }
}
