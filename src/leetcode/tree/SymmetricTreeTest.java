package leetcode.tree.symmetricTree;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Test for 101. Symmetric Tree
 */
public class SymmetricTreeTest {

    @Test
    public void test() {

        System.out.println("SymmetricTreeTest");

        SymmetricTree solution = new SymmetricTree();

        /*
         *     1
         *    / \
         *   2   2
         *  / \ / \
         * 3  4 4  3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean ret = solution.isSymmetric(root);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(true));

        /*
         *    1
         *   / \
         *  2   2
         *   \   \
         *   3    3
         */
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(3);

        ret = solution.isSymmetric(root1);
        System.out.println(ret);
        Assert.assertTrue(new Boolean(ret).equals(false));

    }
}
