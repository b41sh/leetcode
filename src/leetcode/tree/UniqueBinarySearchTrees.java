package leetcode.tree.uniqueBinarySearchTrees;

// Source : https://leetcode.com/problems/unique-binary-search-trees/
// Source : https://leetcode.com/problems/unique-binary-search-trees-ii/
// Author : Shen Bai
// Date   : 2018-06-21

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * Example:
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 *   1         3     3      2      1
 *    \       /     /      / \      \
 *     3     2     1      1   3      2
 *    /     /       \                 \
 *   2     1         2                 3

 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.
 * Example:
 * Input: 3
 * Output:
 * [
 *  [1,null,3,2],
 *  [3,2,null,1],
 *  [3,1,null,null,2],
 *  [2,1,3],
 *  [1,null,2,null,3]
 * ]
 * Explanation:
 * The above output corresponds to the 5 unique BST's shown below:
 *   1         3     3      2      1
 *    \       /     /      / \      \
 *     3     2     1      1   3      2
 *    /     /       \                 \
 *   2     1         2                 3
 *
 */
public class UniqueBinarySearchTrees {

    /**
     * f(0) = 1
     * f(n) = f(0)*f(n-1) + f(1)*f(n-2) + ... + f(n-2)*f(1) + f(n-1)*f(0)
     */
    public int numTrees(int n) {
        if (n <= 1) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return dp[n];
    }

    public List<TreeNode> generateTrees(int n) {

        List<TreeNode> trees = _generateTrees(1, n);
        return trees;
    }

    private List<TreeNode> _generateTrees(int start, int end) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        if (start > end) {
            return trees;
        } else if (start == end) {
            TreeNode node = new TreeNode(start);
            trees.add(node);
            return trees;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNodes = _generateTrees(start, i - 1);
            List<TreeNode> rightNodes = _generateTrees(i + 1, end);

            if (leftNodes.isEmpty()) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode rootNode = new TreeNode(i);
                    rootNode.right = rightNode;
                    trees.add(rootNode);
                }
            } else if (rightNodes.isEmpty()) {
                for (TreeNode leftNode : leftNodes) {
                    TreeNode rootNode = new TreeNode(i);
                    rootNode.left = leftNode;
                    trees.add(rootNode);
                }
            } else {
                for (TreeNode leftNode : leftNodes) {
                    for (TreeNode rightNode : rightNodes) {
                        TreeNode rootNode = new TreeNode(i);
                        rootNode.left = leftNode;
                        rootNode.right = rightNode;
                        trees.add(rootNode);
                    }
                }
            }
        }

        return trees;
    }
}
