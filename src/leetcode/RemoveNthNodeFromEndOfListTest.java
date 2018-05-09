package leetcode.removeNthNodeFromEndOfList;

import org.junit.Assert;
import org.junit.Test;

import leetcode.ListNode;

/**
 * Test for 19. Remove Nth Node From End of List
 */
public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void test() {

        System.out.println("RemoveNthNodeFromEndOfListTest");

        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

        int[] l = new int[] {1, 2, 3, 4, 5};
        int n = 2;

        ListNode node = null;
        ListNode retNode = null;

        ListNode lastNode = null;
        for (int i = l.length - 1; i >= 0; i--) {
            int val = l[i];
            node = new ListNode(val);
            node.next = lastNode;
            lastNode = node;
        }

        retNode = solution.removeNthFromEnd(node, n);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }

        n = 1;
        retNode = solution.removeNthFromEnd(node, n);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }

        n = 5;
        retNode = solution.removeNthFromEnd(node, n);
        while (retNode != null) {
            System.out.println("retNode val=" + retNode.val);
            retNode = retNode.next;
        }
    }
}