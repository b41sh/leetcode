package leetcode.dp.bestTimeToBuyAndSellStock;

// Source : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Source : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Source : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
// Author : Shen Bai
// Date   : 2018-07-11

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 *
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 *
 * Best Time to Buy and Sell Stock II
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [3,3,5,0,0,3,1,4]
 * Output: 6
 * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
 *              Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 *
 * Best Time to Buy and Sell Stock III
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [3,3,5,0,0,3,1,4]
 * Output: 6
 * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
 *              Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int dp[] = new int[prices.length];
        dp[0] = prices[0];
        int maxIncome = 0;
        for (int i = 1; i < prices.length; i++) {
            int income = prices[i] - dp[i - 1];
            maxIncome = Math.max(income, maxIncome);
            dp[i] = Math.min(dp[i - 1], prices[i]);
        }

        return maxIncome;
    }

    // greedy
    public int maxProfitII(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int dp[] = new int[prices.length];
        dp[0] = prices[0];
        int maxIncome = 0;
        for (int i = 1; i < prices.length; i++) {
            int income = prices[i] - dp[i - 1];
            if (income > 0) {
                maxIncome += income;
                dp[i] = prices[i];
            } else {
                dp[i] = Math.min(dp[i - 1], prices[i]);
            }
        }

        return maxIncome;
    }

    // greedy
    public int maxProfitII2(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

    // dp
    // split into two part
    public int maxProfitIII(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int left[] = new int[prices.length];
        int right[] = new int[prices.length];

        left[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }

        right[prices.length - 1] = 0;
        int max = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            max = Math.max(prices[i], max);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }

        int maxIncome = 0;
        for (int i = 0; i < prices.length; i++) {
            maxIncome = Math.max(left[i] + right[i], maxIncome);
        }

        return maxIncome;
    }
}
