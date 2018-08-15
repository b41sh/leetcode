# 树(tree)

## [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
## [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
## [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

1. recursive S O(n)
2. stack S O(n)
3. Morris Traversal S O(1)

递归和栈的空间复杂度为 O(n)

Morris Traversal 使用线索二叉树(threaded binary tree)，不需要额外空间，使用叶子节点的左右空指针指向下一个需要遍历的节点，空间复杂度为 O(1)
