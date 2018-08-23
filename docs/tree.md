# 树(tree)

## [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
## [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
## [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

1. recursive S O(n)
2. stack S O(n)
3. Morris Traversal S O(1)

递归和栈的空间复杂度为 O(n)

Morris Traversal 使用线索二叉树(threaded binary tree)，不需要额外空间，使用叶子节点的左右空指针指向下一个需要遍历的节点，空间复杂度为 O(1)

## [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)

### 思路一

按行遍历，将每一行的数据放入队列，从左向右遍历，结果超时

### 思路二

* 满二叉树Full Binary Tree每一层所有节点都是满的
* 完全二叉树最后一层节点不满

分别递归左右子树，根据高度判断是否是完全二叉树，可直接得出节点数

1. 假如左子树高度等于右子树高度，则右子树为完全二叉树，左子树为满二叉树。
2. 假如高度不等，则左字数为完全二叉树，右子树为满二叉树。
3. 求高度的时候只往左子树来找。

