# Contest

## [Warm Up Contest](https://leetcode.com/contest/warm-up-contest)

### [386. Lexicographical Numbers](https://leetcode.com/contest/warm-up-contest/problems/lexicographical-numbers/)

思路：递归遍历，循环每次放入10个数

优化：将递归改为循环可以减少执行时间

### [387. First Unique Character in a String](https://leetcode.com/contest/warm-up-contest/problems/first-unique-character-in-a-string/)

思路：map+list，map放字母和对应的位置，list放字母，如果有重复则从list中移除，最后取list中第一个元素

优化：从'a'到'z'遍历，取每个字母在字符串中的第一次出现的位置和最后一次出现的位置，如果相同则为只出现一次

### [388. Longest Absolute File Path](https://leetcode.com/contest/warm-up-contest/problems/longest-absolute-file-path/)

思路：用\n分割字符串，再根据\t的个数判断层级，将层级对应的长度记录到map中，如果是文件，累加map中各个层级的长度


## [Weekly Contest 99](https://leetcode.com/contest/weekly-contest-99)

### [892. Surface Area of 3D Shapes](https://leetcode.com/contest/weekly-contest-99/problems/surface-area-of-3d-shapes/)

思路：先从左上到右下遍历，记录底边、左边和上边两面的面积，再从右下到左上遍历，记录下右边和下边的面积

### [893. Groups of Special-Equivalent Strings](https://leetcode.com/contest/weekly-contest-99/problems/groups-of-special-equivalent-strings/)

思路：遍历，将每个字符串按奇数和偶数分为两组，分别排序后合并为一个字符串，以该字符串为key，计算不重复的个数

### [894. All Possible Full Binary Trees](https://leetcode.com/contest/weekly-contest-99/problems/all-possible-full-binary-trees/)

思路：依次递归出各个数目的二叉树，分别放到根节点的左右子树


## [Weekly Contest 100](https://leetcode.com/contest/weekly-contest-100)

### [896. Monotonic Array](https://leetcode.com/contest/weekly-contest-100/problems/monotonic-array/)

思路：从左向右遍历，记录下第一组不相同数字的顺序，后续数字的顺序如果不同，则不是单调数组

### [897. Increasing Order Search Tree](https://leetcode.com/contest/weekly-contest-100/problems/increasing-order-search-tree/)

思路：递归遍历，从左向右组合

### [898. Bitwise ORs of Subarrays](https://leetcode.com/contest/weekly-contest-100/problems/bitwise-ors-of-subarrays/)

思路1：用二维dp[][]数组记录，i和j分别表示开始的位置和结束的位置，时间复杂度O(n^2)，空间复杂度O(n^2)，将每一步遍历的结果放入set，最后返回set的size

思路2：用一维维dp[]数组记录，按行遍历，每一行在上一行的基础上计算，时间复杂度O(n^2)，空间复杂度O(n)

思路3：计算过程中有大量重复的数字，为减少这部分计算，将每一行的结果放入set，下一行只需要将改行的第一个元素依次与set中的元素异或即可

### [899. Orderly Queue](https://leetcode.com/contest/weekly-contest-100/problems/orderly-queue/)

思路：如果K为1，则相当于逆序，依次选择所有逆序组合比较，选出最小的一个。如果K大于等于2，则可以用冒泡排序排出最小的数组


## [Weekly Contest 101](https://leetcode.com/contest/weekly-contest-101)

### [900. RLE Iterator](https://leetcode.com/contest/weekly-contest-101/problems/rle-iterator/)

思路：数组从左向右遍历，只处理偶数位，每次记录下当前位置，供下一次遍历时使用

### [901. Online Stock Span](https://leetcode.com/contest/weekly-contest-101/problems/online-stock-span/)

思路：两个数组分别记录价格和个数，改为栈可以优化空间复杂度

### [902. Numbers At Most N Given Digit Set](https://leetcode.com/contest/weekly-contest-101/problems/numbers-at-most-n-given-digit-set/)

思路：每一位的个数为字符串个数的N次方，遍历计算出每一位的个数，0到N-1位都符合条件，直接累计，N位用数组串数组中的元素依次比对，符合条件的累加

### [903. Valid Permutations for DI Sequence](https://leetcode.com/contest/weekly-contest-101/problems/valid-permutations-for-di-sequence/)

思路1：深度优先遍历，结果超时

思路2：dp



## [Weekly Contest 105](https://leetcode.com/contest/weekly-contest-105)

### [918. Maximum Sum Circular Subarray](https://leetcode.com/contest/weekly-contest-105/problems/maximum-sum-circular-subarray/)

思路：普通的最大子字符串使用Kadane算法，环形最大字符串需要考虑最大值在两边的情况，算出连续字符串的最小值，再用总数减去这个值得到，剩余部分即为最大值。

### [920. Number of Music Playlists](https://leetcode.com/problems/number-of-music-playlists/description/)

思路：dp[i][j]，长度为i，使用j首不同歌曲的播放列表

```
dp[i][j] = 
// 添加一首新歌，已用j-1首，从(N-(j-1))中取
dp[i - 1][j - 1] * (N - (j - 1))
// 重复使用已存在的歌曲
dp[i - 1][j] * max(j - K, 0)
```
