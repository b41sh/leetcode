package leetcode.list.removeLinkedListElements;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 203. Remove Linked List Elements
 */
public class RemoveLinkedListElementsTest {

    @Test
    public void test() {

        System.out.println("RemoveLinkedListElementsTest");

        RemoveLinkedListElements solution = new RemoveLinkedListElements();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        int val = 6;

        solution.removeElements(l1, val);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}