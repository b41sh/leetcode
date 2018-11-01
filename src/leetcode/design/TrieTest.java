package leetcode.design.trie;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 208. Implement Trie (Prefix Tree)
 */
public class TrieTest {

    @Test
    public void test() {

        System.out.println("TrieTest");

        Trie trie = new Trie();

        boolean ret = false;
        trie.insert("apple");
        ret = trie.search("apple");   // returns true
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
        ret = trie.search("app");     // returns false
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));
        ret = trie.startsWith("app"); // returns true
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
        trie.insert("app");
        ret = trie.search("app");     // returns true
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));
    }
}
