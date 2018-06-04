package leetcode.dp.wildcardMatching;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 44. Wildcard Matching
 */
public class WildcardMatchingTest {

    @Test
    public void test() {

        System.out.println("WildcardMatchingTest");

        WildcardMatching solution = new WildcardMatching();

        String s = "";
        String p = "";
        boolean ret = false;

        s = "aa";
        p = "a";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "aa";
        p = "*";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "cb";
        p = "?a";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "adceb";
        p = "*a*b";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "adceb";
        p = "a*c?b";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "acdcb";
        p = "a*c?b";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "aab";
        p = "c*a*b";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "adcdcdcdcdcdceb";
        p = "a*c?b";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        s = "a";
        p = "";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

        s = "aaaa";
        p = "***a";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(true));


        s = "aaaaaabbaabaaaaabababbabbaababbaabaababaaaaabaaaabaaaabababbbabbbbaabbababbbbababbaaababbbabbbaaaaaaabbaabbbbababbabbaaabababaaaabaaabaaabbbbbabaaabbbaabbbbbbbaabaaababaaaababbbbbaabaaabbabaabbaabbaaaaba";
        p = "*bbb**a*******abb*b**a**bbbbaab*b*aaba*a*b**a*abb*aa****b*bb**abbbb*b**bbbabaa*b**ba**a**ba**b*a*a**aaa";
        ret = solution.isMatch(s, p);
        System.out.println("s=" + s + " p=" + p + " ret=" + ret);
        Assert.assertTrue(new Boolean(ret).equals(false));


    }
}
