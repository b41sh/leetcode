package leetcode.design.lruCache;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 146. LRU Cache
 */
public class LRUCacheTest {

    @Test
    public void test() {

        System.out.println("LRUCacheTest");

        LRUCache cache = new LRUCache(2);

        int val = 0;
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        cache.put(5,5);
        val = cache.get(1);
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(-1));
        val = cache.get(2);
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(-1));
        val = cache.get(3);
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(-1));
        val = cache.get(4);
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(4));
        val = cache.get(5);
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(5));


        cache.put(1,1);
        cache.put(2,2);
        val = cache.get(1);
        // returns 1
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(1));
        // evicts key 2
        cache.put(3,3);
        val = cache.get(2);
        // returns -1 (not found)
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(-1));
        // evicts key 1
        cache.put(4,4);
        val = cache.get(1);
        // returns -1 (not found)
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(-1));
        val = cache.get(3);
        // returns 3
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(3));
        val = cache.get(4);
        // returns 4
        System.out.println("val=" + val);
        Assert.assertTrue(new Integer(val).equals(4));

    }
}
