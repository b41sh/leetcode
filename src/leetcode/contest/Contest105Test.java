package leetcode.contest.contest105;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Weekly Contest 105
 */
public class Contest105Test {
    @Test
    public void test() {

        System.out.println("Contest105Test");

        Contest105 solution = new Contest105();

        String ret11 = "";
        String s1 = "ab-cd";
        ret11 = solution.reverseOnlyLetters(s1);
        System.out.println(s1 + "  " + ret11);

        String s2 = "a-bC-dEf-ghIj";
        ret11 = solution.reverseOnlyLetters(s2);
        System.out.println(s2 + "  " + ret11);

        String s3 = "Test1ng-Leet=code-Q!";
        ret11 = solution.reverseOnlyLetters(s3);
        System.out.println(s3 + "  " + ret11);

        int ret21 = 0;
        int[] A1 = new int[]{1,-2,3,-2};
        ret21 = solution.maxSubarraySumCircular(A1);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(3));

        int[] A2 = new int[]{5,-3,5};
        ret21 = solution.maxSubarraySumCircular(A2);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(10));

        int[] A3 = new int[]{3,-2,2,-1};
        ret21 = solution.maxSubarraySumCircular(A3);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(4));

        int[] A4 = new int[]{3,-2,2,-3};
        ret21 = solution.maxSubarraySumCircular(A4);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(3));

        int[] A5 = new int[]{-2,-3,-1};
        ret21 = solution.maxSubarraySumCircular(A5);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(-1));

        int[] A6 = new int[]{-1,3,-3,9,-6,8,-5,-5,-6,10};
        ret21 = solution.maxSubarraySumCircular(A6);
        System.out.println("ret=" + ret21);
        Assert.assertTrue(new Integer(ret21).equals(20));


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Contest105.CBTInserter cbtInserter = new Contest105().new CBTInserter(root);
        cbtInserter.insert(7);
        cbtInserter.insert(8);

        TreeNode ret = cbtInserter.get_root();
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);
        System.out.println(root.left.left.left.val);

        int N = 3;
        int L = 3;
        int K = 1;
        int ret4 = solution.numMusicPlaylists(N, L, K);
        System.out.println("ret=" + ret4);


        int N1 = 16;
        int L1 = 16;
        int K1 = 4;
        int ret41 = solution.numMusicPlaylists(N1, L1, K1);
        System.out.println("ret=" + ret41);


    }
}
