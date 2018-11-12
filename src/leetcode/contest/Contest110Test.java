package leetcode.contest.contest110;

import leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 110
 */
public class Contest110Test {
    @Test
    public void test() {

        System.out.println("Contest110Test");

        Contest110 solution = new Contest110();

        String[] logs = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] retLogs = solution.reorderLogFiles(logs);
        for (int i = 0; i < retLogs.length; i++) {
            System.out.println(retLogs[i]);
        }

        String[] logs2 = new String[]{"j mo", "5 m w", "g 07", "o 2 0", "t q h"};
        String[] retLogs2 = solution.reorderLogFiles(logs2);
        System.out.println("------------");
        for (int i = 0; i < retLogs2.length; i++) {
            System.out.println(retLogs2[i]);
        }

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);
        int L = 7;
        int R = 15;
        int sum = solution.rangeSumBST(root, L, R);
        System.out.println("sum=" + sum);

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.left.left = new TreeNode(3);
        root1.left.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(7);
        root1.left.right.left = new TreeNode(6);
        root1.right = new TreeNode(15);
        root1.right.right = new TreeNode(18);
        int L1 = 6;
        int R1 = 10;
        int sum1 = solution.rangeSumBST(root1, L1, R1);
        System.out.println("sum1=" + sum1);

        int[][] points = new int[][]{
                {1,1},{1,3},{3,1},{3,3},{2,2}
        };
        int minArea = solution.minAreaRect(points);
        System.out.println("minArea=" + minArea);

        int[][] points1 = new int[][]{
                {1, 1}, {1, 3}, {3, 1}, {3, 3}, {4, 1}, {4, 3}
        };
        int minArea1 = solution.minAreaRect(points1);
        System.out.println("minArea1=" + minArea1);

        String S = "abc";
        int ret = solution.distinctSubseqII(S);
        System.out.println("ret=" + ret);

        String S1 = "aba";
        int ret1 = solution.distinctSubseqII(S1);
        System.out.println("ret1=" + ret1);

        String S2 = "aaa";
        int ret2 = solution.distinctSubseqII(S2);
        System.out.println("ret2=" + ret2);

    }
}
