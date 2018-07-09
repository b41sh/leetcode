package leetcode.tree.populatingNextRightPointersInEachNode;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeLinkNode;

/**
 * Test for 116. Populating Next Right Pointers in Each Node
 * Test for 117. Populating Next Right Pointers in Each NodeII
 */
public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void test() {

        System.out.println("PopulatingNextRightPointersInEachNodeTest");

        PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

        /*
         *      1
         *    /  \
         *   2    3
         *  / \  / \
         * 4  5  6  7
         */
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.left = new TreeLinkNode(6);
        root.right.right = new TreeLinkNode(7);
        solution.connect(root);

        System.out.println(root.left.next.val);
        System.out.println(root.left.left.next.val);
        System.out.println(root.left.right.next.val);
        System.out.println(root.right.left.next.val);

    }
}
