package leetcode.mergeKSortedLists;

import org.junit.Assert;
import org.junit.Test;

import leetcode.ListNode;

/**
 * Test for 23. Merge k Sorted Lists
 */
public class MergeKSortedListsTest {
    @Test
    public void test() {

        System.out.println("MergeKSortedListsTest");

        MergeKSortedLists solution = new MergeKSortedLists();

        int[] l1 = new int[] {1, 4, 5};
        int[] l2 = new int[] {1, 3, 4};
        int[] l3 = new int[] {2, 6};

        ListNode node1 = null;
        ListNode node2 = null;
        ListNode node3 = null;
        ListNode lastNode = null;
        ListNode retNode = null;

        lastNode = null;
        for (int i1 = l1.length - 1; i1 >= 0; i1--) {
            int val1 = l1[i1];
            node1 = new ListNode(val1);
            node1.next = lastNode;
            lastNode = node1;
        }
        lastNode = null;
        for (int i2 = l2.length - 1; i2 >= 0; i2--) {
            int val2 = l2[i2];
            node2 = new ListNode(val2);
            node2.next = lastNode;
            lastNode = node2;
        }
        lastNode = null;
        for (int i3 = l3.length - 1; i3 >= 0; i3--) {
            int val3 = l3[i3];
            node3 = new ListNode(val3);
            node3.next = lastNode;
            lastNode = node3;
        }

        ListNode[] lists = new ListNode[] {node1, node2, node3};

        retNode = solution.mergeKLists(lists);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }
    }
}