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


## [221. Maximal Square](https://leetcode.com/problems/maximal-square)

思路：每一个节点的正方形大小由它上边、左边和左上边正方形的最小值决定，`dp[i][j]=min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1)`

### 第一版

`int[]w` 记录宽度，`int[]h` 记录高度，如果`matrix[i][j]`为1，取`h[i]`、`w[j]`、`dp[i-1][j-1]`的最小值，加一为`dp[i][j]`的宽高，否则`dp[i][j]`为0，然后更新`h[j]`和`w[i]`，遍历一遍后得出最大值

### 第二版

* 额外记录宽度和高度是多余的，`dp[i][j]`表示的是宽高的最小值，直接比较宽高即可
* char转int直接减去`'0'`即可，`int num = matrix[i][j] - '0'`

## [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

新出现的值可能是负数，所以之前的结果正数和负数都要保留，用两个数组分别记录截止当前位置相乘正数的最大值和负数的最小值

```java
int n = nums[i];
int a = nums[i] * dp1[i - 1];
int b = nums[i] * dp2[i - 1];
int max = Math.max(Math.max(a, b), n);
int min = Math.min(Math.min(a, b), n);
dp1[i] = (max > 0) ? max : 0;
dp2[i] = (min < 0) ? min : 0;
```

