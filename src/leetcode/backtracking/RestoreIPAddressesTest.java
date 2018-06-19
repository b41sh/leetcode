package leetcode.backtracking.restoreIPAddresses;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Test for 93. Restore IP Addresses
 */
public class RestoreIPAddressesTest {
    @Test
    public void test() {

        System.out.println("RestoreIPAddressesTest");

        RestoreIPAddresses solution = new RestoreIPAddresses();
        List<String> ret = new ArrayList<String>();

        String s = "25525511135";
        ret = solution.restoreIpAddresses(s);
        System.out.println(ret);

        s = "0000";
        ret = solution.restoreIpAddresses(s);
        System.out.println(ret);

    }
}
