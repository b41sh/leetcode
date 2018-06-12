package leetcode.list.removeDuplicatesFromSortedList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 82. Remove Duplicates from Sorted List II
 * Test for 83. Remove Duplicates from Sorted List
 */
public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void test() {

        System.out.println("RemoveDuplicatesFromSortedListTest");

        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        int[] nums = new int[]{1,1,2,3,3};
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

        ListNode ret = solution.deleteDuplicates(head);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
        System.out.print("\n===============\n");

        nums = new int[]{1,2,3,3,4,4,5};
        pre = null;
        head = null;
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

        ret = solution.deleteDuplicatesII(head);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
        System.out.print("\n");

    }
}