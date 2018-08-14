package leetcode.list.insertionSortList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 147. Insertion Sort List
 */
public class InsertionSortListTest {

    @Test
    public void test() {

        System.out.println("InsertionSortListTest");
        InsertionSortList solution = new InsertionSortList();

        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(8);
        ListNode l6 = new ListNode(7);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;

        ListNode ret = solution.insertionSortList(l1);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}