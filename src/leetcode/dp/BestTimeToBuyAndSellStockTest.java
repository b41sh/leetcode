package leetcode.dp.bestTimeToBuyAndSellStock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 121. Best Time to Buy and Sell Stock
 * Test for 122. Best Time to Buy and Sell Stock II
 * Test for 123. Best Time to Buy and Sell Stock III
 */
public class BestTimeToBuyAndSellStockTest {
    @Test
    public void test() {

        System.out.println("BestTimeToBuyAndSellStockTest");

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        int prices[] = new int[]{7,1,5,3,6,4};
        int ret = 0;
        ret = solution.maxProfit(prices);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        ret = solution.maxProfitII(prices);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(7));

        int prices2[] = new int[]{3,3,5,0,0,3,1,4};
        ret = solution.maxProfitIII(prices2);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(6));

    }
}
