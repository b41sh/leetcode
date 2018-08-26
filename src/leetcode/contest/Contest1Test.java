package leetcode.contest.contest99;

import java.util.List;
import leetcode.TreeNode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 1
 */
public class Contest1Test {
    @Test
    public void test() {

        System.out.println("Contest1Test");

        Contest1 solution = new Contest1();

        int n = 103;
        List<Integer> ret = solution.lexicalOrder(n);
        System.out.println(ret);

        int n2 = 10458;
        List<Integer> ret2 = solution.lexicalOrder(n2);
        System.out.println(ret2);

        int ret3 = 0;
        String s1 = "leetcode";
        ret3 = solution.firstUniqChar(s1);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(0));

        String s2 = "loveleetcode";
        ret3 = solution.firstUniqChar(s2);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(2));

        String s3 = "aabb";
        ret3 = solution.firstUniqChar(s3);
        System.out.println(ret3);
        Assert.assertTrue(new Integer(ret3).equals(-1));

        int ret4 = 0;
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        ret4 = solution.lengthLongestPath(input);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(32));

        String input2 = "a";
        ret4 = solution.lengthLongestPath(input2);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(0));

        String input3 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        ret4 = solution.lengthLongestPath(input3);
        System.out.println(ret4);
        Assert.assertTrue(new Integer(ret4).equals(20));
    }
}
