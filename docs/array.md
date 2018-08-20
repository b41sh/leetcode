# 数组(array)

## [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)

二分查找，遍历两遍，分别获取到左边的边界和右边的边界

## [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water)

双指针，分别从左右向中间遍历，移动大的


## [56. Merge Intervals](https://leetcode.com/problems/merge-intervals)

将begins和ends分为两组，分别排序，从头开始遍历begins，如果begins[i]大于ends[i-1]，可以合并，否则分开


## [72. Minimum Path Sum](https://leetcode.com/problems/set-matrix-zeroes)

遍历判断每一行和每一列是否为0，为了不使用额外空间，将结果记录到第一行和第一列，第一行和第一列是否为0单独记录到额外的空间

## [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix)

二分查找

```
midRow = top + (bottom - top) / 2;
```

## [75. Sort Colors](https://leetcode.com/problems/sort-colors)

三个指针，一个指向red、一个指向blue、另一个从0开始遍历，如果是red或blue，就和对应的指针指向的数据swap

## [78. Subsets](https://leetcode.com/problems/subsets)
## [90. Subsets II](https://leetcode.com/problems/subsets-ii)

backtracking，递归遍历，将元素依次加入

## [79. Word Search](https://leetcode.com/problems/word-search)

backtracking，递归遍历，依次判断上下左右四个元素

## [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array)
## [81. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array-ii)

二分查找


## [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram)
## [85. Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle)

两个栈，首先从左向右遍历，将栈中比当前高度高的都出栈，找到不低于当前高度最左边位置，记为当前高度总宽度，再从右向左遍历，找到不低于当前高度的最右边位置，记为当前高度总宽度。最后遍历，将高度和宽度相乘，得出最大的面积




