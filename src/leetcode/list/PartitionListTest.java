package leetcode.list.partitionList;

import org.junit.Assert;
import org.junit.Test;
import leetcode.ListNode;

/**
 * Test for 86. Partition List
 */
public class PartitionListTest {

    @Test
    public void test() {

        System.out.println("PartitionListTest");

        PartitionList solution = new PartitionList();

        int[] nums = new int[]{1,4,3,2,5,2};
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
        int x = 3;

        ListNode ret = solution.partition(head, x);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
        System.out.print("\n===============\n");

        nums = new int[]{1,2};
        pre = null;
        head = null;
        x = 2;
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

        ret = solution.partition(head, x);
        while (ret != null) {
            System.out.print(ret.val + " -> ");
            ret = ret.next;
        }
        System.out.print("\n");
    }
}