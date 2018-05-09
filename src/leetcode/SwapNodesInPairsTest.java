package leetcode.swapNodesInPairs;

import org.junit.Assert;
import org.junit.Test;

import leetcode.ListNode;

/**
 * Test for 24. Swap Nodes in Pairs
 */
public class SwapNodesInPairsTest {
    @Test
    public void test() {

        System.out.println("SwapNodesInPairsTest");

        SwapNodesInPairs solution = new SwapNodesInPairs();

        int[] l1 = new int[] {1, 2, 3, 4, 5, 6};
        ListNode node1 = null;
        ListNode lastNode = null;
        ListNode retNode = null;

        lastNode = null;
        for (int i1 = l1.length - 1; i1 >= 0; i1--) {
            int val1 = l1[i1];
            node1 = new ListNode(val1);
            node1.next = lastNode;
            lastNode = node1;
        }

        retNode = solution.swapPairs(node1);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }
    }
}