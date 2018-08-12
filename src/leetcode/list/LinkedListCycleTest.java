package leetcode.list.linkedListCycle;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 141. Linked List Cycle
 * Test for 142. Linked List Cycle II
 */
public class LinkedListCycleTest {

    @Test
    public void test() {

        System.out.println("LinkedListCycleTest");

        LinkedListCycle solution = new LinkedListCycle();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l3;

        boolean ret = false;
        ret = solution.hasCycle(l1);
        Assert.assertTrue(new Boolean(ret).equals(true));

        ListNode ret2 = solution.detectCycle(l1);
        System.out.println("ret=" + ret2.val);
    }
}