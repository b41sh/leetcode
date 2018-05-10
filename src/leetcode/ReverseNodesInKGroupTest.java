package leetcode.reverseNodesInKGroup;

import org.junit.Assert;
import org.junit.Test;

import leetcode.ListNode;

/**
 * Test for 25. Reverse Nodes in k-Group
 */
public class ReverseNodesInKGroupTest {
    @Test
    public void test() {

        System.out.println("ReverseNodesInKGroupTest");

        ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

        int[] l1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //int[] l1 = new int[] {1, 2, 3};
        int k = 2;
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

        retNode = solution.reverseKGroup(node1, k);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }
    }
}