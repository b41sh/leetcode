package leetcode.contest.contest111;

import leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 111
 */
public class Contest111Test {
    @Test
    public void test() {

        System.out.println("Contest111Test");

        Contest111 solution = new Contest111();

        int[] A1 = new int[]{2,1};
        boolean ret11 = solution.validMountainArray(A1);
        System.out.println("ret11=" + ret11);
        Assert.assertTrue(new Boolean(ret11).equals(false));

        int[] A2 = new int[]{3,5,5};
        boolean ret12 = solution.validMountainArray(A2);
        System.out.println("ret12=" + ret12);
        Assert.assertTrue(new Boolean(ret12).equals(false));

        int[] A3 = new int[]{0,3,2,1};
        boolean ret13 = solution.validMountainArray(A3);
        System.out.println("ret13=" + ret13);
        Assert.assertTrue(new Boolean(ret13).equals(true));


        String S1 = "IDID";
        int[] ret21 = solution.diStringMatch(S1);
        for (int i = 0; i < ret21.length; i++) {
            System.out.print(ret21[i] + " ");
        }
        System.out.println("");

        String S2 = "III";
        int[] ret22 = solution.diStringMatch(S2);
        for (int i = 0; i < ret22.length; i++) {
            System.out.print(ret22[i] + " ");
        }
        System.out.println("");

        String S3 = "DDI";
        int[] ret23 = solution.diStringMatch(S3);
        for (int i = 0; i < ret23.length; i++) {
            System.out.print(ret23[i] + " ");
        }
        System.out.println("");

        String S4 = "IIDDIDDDIIIIIDIIIDI";
        int[] ret24 = solution.diStringMatch(S4);
        for (int i = 0; i < ret24.length; i++) {
            System.out.print(ret24[i] + " ");
        }
        System.out.println("");

        String[] A31 = new String[]{"cba", "daf", "ghi"};
        int ret31 = solution.minDeletionSize(A31);
        System.out.println("ret31=" + ret31);
        Assert.assertTrue(new Integer(ret31).equals(1));

        String[] A32 = new String[]{"a", "b"};
        int ret32 = solution.minDeletionSize(A32);
        System.out.println("ret32=" + ret32);
        Assert.assertTrue(new Integer(ret32).equals(0));

        String[] A33 = new String[]{"zyx", "wvu", "tsr"};
        int ret33 = solution.minDeletionSize(A33);
        System.out.println("ret33=" + ret33);
        Assert.assertTrue(new Integer(ret33).equals(3));

    }
}
