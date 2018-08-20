# 动态规范(dp)

## [62. Unique Paths](https://leetcode.com/problems/unique-paths)
## [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii)
## [64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum)

从左上角向右下角遍历，每个dp[i]和它左边和上边的元素比较后生成

优化：将二维数组改为一维数组滚动

## [120. Triangle](https://leetcode.com/problems/triangle)

自底向上遍历

```                
dp[j] = min(dp[j], dp[j+1]) + triangle[i][j]
```

## [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock)
## [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii)
## [123. Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii)

dp记录当前最小的价格，遍历记录差值最大的两个节点
```
int income = prices[i] - dp[i - 1];
maxIncome = Math.max(income, maxIncome);
dp[i] = Math.min(dp[i - 1], prices[i]);
```

第二个可以买卖多次，转为贪心，只要价格比前一个节点大就进行买进卖出，累加多次买卖的结果


