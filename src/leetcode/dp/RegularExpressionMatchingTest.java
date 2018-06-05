package leetcode.dp.regularExpressionMatching;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 10. Regular Expression Matching
 */
public class RegularExpressionMatchingTest {
    @Test
    public void test() {

        System.out.println("RegularExpressionMatchingTest");

        RegularExpressionMatching solution = new RegularExpressionMatching();

        String s = "";
        String p = "";
        boolean ret = false;

        s = "aa";
        p = "a";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "aa";
        p = "aa";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "aaa";
        p = "aa";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "baa";
        p = "a*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "aa";
        p = ".*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "ab";
        p = "a.*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "aab";
        p = "c*a*b*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "mississippi";
        p = "mis*is*p*.";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "bbbba";
        p = ".*a*a";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "a";
        p = "ab*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "";
        p = ".*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "aasdfasdfasdfasdfas";
        p = "aasdf.*asdf.*asdf.*asdf.*s";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

    }
}

/**
  # a a s d f a s d f a s d f a s d f a s
# 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
a 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
a 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
s 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
d 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
f 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
. 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0
* 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
a 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0 0 0 1 0
s 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0 0 0 1
d 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0 0 0
f 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0 0
. 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0
* 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1
a 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1 0
s 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0 1
d 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 0
f 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0
. 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0
* 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1
a 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0
s 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1
d 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0
f 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0
. 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0
* 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1
s 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
s=aasdfasdfasdfasdfas 
p=aasdf.*asdf.*asdf.*asdf.*s ret=false

  # m i s s i s s i p p i
# 1 0 0 0 0 0 0 0 0 0 0 0
m 0 1 0 0 0 0 0 0 0 0 0 0
i 0 0 1 0 0 0 0 0 0 0 0 0
s 0 0 0 1 0 0 0 0 0 0 0 0
* 0 0 1 1 1 0 0 0 0 0 0 0
i 0 0 0 0 0 1 0 0 0 0 0 0
s 0 0 0 0 0 0 1 0 0 0 0 0
* 0 0 0 0 0 1 1 1 0 0 0 0
p 0 0 0 0 0 0 0 0 0 0 0 0
* 0 0 0 0 0 1 1 1 0 0 0 0
. 0 0 0 0 0 0 1 1 1 0 0 0
s=mississippi p=mis*is*p*. ret=false
*/
