package leetcode.rotateList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 61. Rotate List
 */
public class RotateListTest {

    @Test
    public void test() {

        System.out.println("RotateListTest");

        RotateList solution = new RotateList();

        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4);
        l4.next = l5;
        ListNode l3 = new ListNode(3);
        l3.next = l4;
        ListNode l2 = new ListNode(2);
        l2.next = l3;
        ListNode head = new ListNode(1);
        head.next = l2;
        int k = 2;
        ListNode ret = solution.rotateRight(head, k);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
        System.out.print("\n");
    }
}