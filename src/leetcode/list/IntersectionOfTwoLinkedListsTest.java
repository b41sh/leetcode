package leetcode.list.intersectionOfTwoLinkedLists;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 160. Intersection of Two Linked Lists
 */
public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void test() {

        System.out.println("IntersectionOfTwoLinkedListsTest");
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

        ListNode a1 = new ListNode(11);
        ListNode a2 = new ListNode(12);

        ListNode b1 = new ListNode(21);
        ListNode b2 = new ListNode(22);
        ListNode b3 = new ListNode(23);

        ListNode c1 = new ListNode(31);
        ListNode c2 = new ListNode(32);
        ListNode c3 = new ListNode(33);

        c1.next = c2;
        c2.next = c3;
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        ListNode ret = solution.getIntersectionNode(a1, b1);
        System.out.println(ret.val);
        Assert.assertTrue(new Integer(ret.val).equals(31));
    }
}