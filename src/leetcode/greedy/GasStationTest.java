package leetcode.greedy.gasStation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 134. Gas Station
 */
public class GasStationTest {

    @Test
    public void test() {

        System.out.println("GasStationTest");

        GasStation solution = new GasStation();

        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        int ret = 0;
        ret = solution.canCompleteCircuit(gas, cost);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        int[] gas1 = new int[]{2, 3, 4};
        int[] cost1 = new int[]{3, 4, 3};
        ret = solution.canCompleteCircuit(gas1, cost1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(-1));
    }
}
