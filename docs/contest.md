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
