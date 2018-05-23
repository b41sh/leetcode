package leetcode.groupAnagrams;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 49. Group Anagrams
 */
public class GroupAnagramsTest {

    @Test
    public void test() {

        System.out.println("GroupAnagramsTest");

        GroupAnagrams solution = new GroupAnagrams();

        List<List<String>> ret = new ArrayList<List<String>>();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        ret = solution.groupAnagrams(strs);

        System.out.println(ret);

    }
}