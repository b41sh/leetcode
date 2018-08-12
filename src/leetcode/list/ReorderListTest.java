package leetcode.list.reorderList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 143. Reorder List
 */
public class ReorderListTest {

    @Test
    public void test() {

        System.out.println("ReorderListTest");

        ReorderList solution = new ReorderList();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        solution.reorderList(l1);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}