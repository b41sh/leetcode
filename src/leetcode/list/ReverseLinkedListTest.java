package leetcode.list.reverseLinkedList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 92. Reverse Linked List II
 */
public class ReverseLinkedListTest {

    @Test
    public void test() {

        System.out.println("ReverseLinkedListTest");

        ReverseLinkedList solution = new ReverseLinkedList();

        int[] nums = new int[]{1,2,3,4,5};
        ListNode pre = null;
        ListNode head = null;
        for (int i = 0; i < nums.length; i++) {
            ListNode cur = new ListNode(nums[i]);
            if (pre == null) {
                pre = cur;
                head = cur;
            } else {
                pre.next = cur;
                pre = cur;
            }
        }
        int m = 2;
        int n = 4;

        ListNode ret = solution.reverseBetween(head, m, n);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
    }
}