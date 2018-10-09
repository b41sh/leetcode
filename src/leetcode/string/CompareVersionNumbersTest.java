package leetcode.string.compareVersionNumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 165. Compare Version Numbers
 */
public class CompareVersionNumbersTest {
    @Test
    public void test() {

        System.out.println("CompareVersionNumbersTest");

        CompareVersionNumbers solution = new CompareVersionNumbers();

        int ret = 0;
        String version11 = "0.a1";
        String version21 = "1.1";
        ret = solution.compareVersion(version11, version21);
        System.out.println("ret=" + ret);
        //Assert.assertTrue(new Integer(ret).equals(-1));

        String version12 = "1.0.1";
        String version22 = "1";
        ret = solution.compareVersion(version12, version22);
        System.out.println("ret=" + ret);
        //Assert.assertTrue(new Integer(ret).equals(1));

        String version13 = "7.5.2.4";
        String version23 = "7.5.3";
        ret = solution.compareVersion(version13, version23);
        System.out.println("ret=" + ret);
        //Assert.assertTrue(new Integer(ret).equals(-1));
    }
}

