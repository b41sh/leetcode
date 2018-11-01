package leetcode.design.wordDictionary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 211. Add and Search Word - Data structure design
 */
public class WordDictionaryTest {

    @Test
    public void test() {

        System.out.println("WordDictionaryTest");


        String s = "abc";
        String s2 = s.substring(0);
        System.out.println(s2);
        String s3 = s.substring(1);
        System.out.println(s3);

        WordDictionary wordDictionary = new WordDictionary();
        boolean ret = false;

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        ret = wordDictionary.search("pad");
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));
        ret = wordDictionary.search("bad");
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
        ret = wordDictionary.search(".ad");
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
        ret = wordDictionary.search("b..");
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
