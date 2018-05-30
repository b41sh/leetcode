package leetcode.simplifyPath;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 71. Simplify Path
 */
public class SimplifyPathTest {

    @Test
    public void test() {

        System.out.println("SimplifyPathTest");

        SimplifyPath solution = new SimplifyPath();

        String path = "/a/./b/../../c/d/e";
        String ret = "";
        ret = solution.simplifyPath(path);
        System.out.println("path=" + path + " ret=" + ret);

        path = "/../";
        ret = solution.simplifyPath(path);
        System.out.println("path=" + path + " ret=" + ret);

        path = "/home/";
        ret = solution.simplifyPath(path);
        System.out.println("path=" + path + " ret=" + ret);

    }
}