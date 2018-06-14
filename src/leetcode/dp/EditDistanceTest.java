package leetcode.dp.editDistance;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 72. Edit Distance
 */
public class EditDistanceTest {
    @Test
    public void test() {

        System.out.println("EditDistanceTest");

        EditDistance solution = new EditDistance();

        String word1 = "";
        String word2 = "";
        int ret = 0;

        word1 = "horse";
        word2 = "ros";
        ret = solution.minDistance(word1, word2);
        System.out.println("word1=" + word1 + " word2=" + word2 + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        word1 = "intention";
        word2 = "execution";
        ret = solution.minDistance(word1, word2);
        System.out.println("word1=" + word1 + " word2=" + word2 + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        word1 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef";
        word2 = "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg";
        ret = solution.minDistance(word1, word2);
        System.out.println("word1=" + word1 + " word2=" + word2 + " ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));

    }
}
