package leetcode.design.bstIterator;

import leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 173. Binary Search Tree Iterator
 */
public class BSTIteratorTest {

    @Test
    public void test() {

        System.out.println("BSTIteratorTest");

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);

        BSTIterator i = new BSTIterator(root);
        while (i.hasNext()) {
            int ret = i.next();
            System.out.println("ret=" + ret);
        }
    }
}
