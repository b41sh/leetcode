package leetcode.tree.kthSmallestElementInAbst;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import leetcode.TreeNode;

/**
 * Test for 230. Kth Smallest Element in a BST
 */
public class KthSmallestElementInAbstTest {

    @Test
    public void test() {

        System.out.println("KthSmallestElementInAbstTest");

        KthSmallestElementInAbst solution = new KthSmallestElementInAbst();

        /**
         *  *        5
         *  *       / \
         *  *      3   6
         *  *     / \
         *  *    2   4
         *  *   /
         *  *  1
         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        int k = 3;
        int ret = solution.kthSmallest(root, k);
        System.out.println("ret=" + ret);

    }
}
