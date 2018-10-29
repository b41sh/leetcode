package leetcode.contest.contest108;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 108
 */
public class Contest108Test {
    @Test
    public void test() {

        System.out.println("Contest108Test");

        Contest108 solution = new Contest108();

        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int ret = solution.numUniqueEmails(emails);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(2));


        int[] A1 = new int[]{0,1,0,1,0,1};
        int S1 = 2;
        int ret1 = solution.numSubarraysWithSum(A1, S1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(6));

        ret1 = solution.numSubarraysWithSum2(A1, S1);
        System.out.println("ret1=" + ret1);
        Assert.assertTrue(new Integer(ret1).equals(6));


        int[] A2 = new int[]{0,0,0,1,0,0};
        int S2 = 0;
        int ret2 = solution.numSubarraysWithSum(A2, S2);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(9));

        ret2 = solution.numSubarraysWithSum2(A2, S2);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(9));


        int[] A3 = new int[]{0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0};
        int S3 = 3;
        int ret3 = solution.numSubarraysWithSum(A3, S3);
        System.out.println("ret3=" + ret3);
        Assert.assertTrue(new Integer(ret3).equals(48));

        ret3 = solution.numSubarraysWithSum2(A3, S3);
        System.out.println("ret3=" + ret3);
        Assert.assertTrue(new Integer(ret3).equals(48));


        int[] A4 = new int[]{1,0,1,0,1};
        int S4 = 2;
        int ret4 = solution.numSubarraysWithSum(A4, S4);
        System.out.println("ret4=" + ret4);
        Assert.assertTrue(new Integer(ret4).equals(4));

        ret4 = solution.numSubarraysWithSum2(A4, S4);
        System.out.println("ret4=" + ret4);
        Assert.assertTrue(new Integer(ret4).equals(4));


        int[] A5 = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int S5 = 0;
        int ret5 = solution.numSubarraysWithSum(A5, S5);
        System.out.println("ret5=" + ret5);
        Assert.assertTrue(new Integer(ret5).equals(0));

        ret5 = solution.numSubarraysWithSum2(A5, S5);
        System.out.println("ret5=" + ret5);
        Assert.assertTrue(new Integer(ret5).equals(0));


        int[][] A31 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int ret31 = solution.minFallingPathSum(A31);
        System.out.println("ret31=" + ret31);
        Assert.assertTrue(new Integer(ret31).equals(12));

        int[][] A32 = new int[][] {{51,24},{-50,82}};
        int ret32 = solution.minFallingPathSum2(A32);
        System.out.println("ret32=" + ret32);
        Assert.assertTrue(new Integer(ret32).equals(-26));
    }
}
