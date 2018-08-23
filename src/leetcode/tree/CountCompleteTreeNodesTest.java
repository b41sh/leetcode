package leetcode.tree.countCompleteTreeNodes;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;

/**
 * Test for 222. Count Complete Tree Nodes
 */
public class CountCompleteTreeNodesTest {

    @Test
    public void test() {

        System.out.println("CountCompleteTreeNodesTest");

        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        /**
         *     1
         *    / \
         *   2   3
         *  / \  /
         * 4  5 6
         */
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);

        int ret = solution.countNodes(node);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(6));

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode node1 = new TreeNode(1);
        queue.offer(node1);
        int n = 2;
        int size = 0;
        while(queue.size() > 0) {
            if (n >= 2000) {
                break;
            }
            size = queue.size();
            while (size > 0) {
                TreeNode node2 = queue.poll();
                node2.left = new TreeNode(n);
                n++;
                node2.right = new TreeNode(n);
                n++;
                queue.offer(node2.left);
                queue.offer(node2.right);
                size--;
            }
        }
        ret = solution.countNodes(node1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(2047));

    }
}
