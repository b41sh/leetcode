package leetcode.contest.contest106;

import org.junit.Assert;
import org.junit.Test;
import leetcode.TreeNode;

/**
 * Weekly Contest 106
 */
public class Contest106Test {
    @Test
    public void test() {

        System.out.println("Contest106Test");

        Contest106 solution = new Contest106();


        int[] A = new int[]{1,1,1,1,1,1,1,2,2,2,2,2,2,2,2};
        int[] retA = solution.sortArrayByParityII(A);

        for (int i = 0; i < retA.length; i++) {
            System.out.println(retA[i] + " ");
        }

        int ret = 0;
        String S1 = "())";
        ret = solution.minAddToMakeValid(S1);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(1));

        String S2 = "(((";
        ret = solution.minAddToMakeValid(S2);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(3));

        String S3 = "()";
        ret = solution.minAddToMakeValid(S3);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(0));

        String S4 = "()))((";
        ret = solution.minAddToMakeValid(S4);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        int[] A1 = new int[]{1,1,2,2,3,3,4,4,5,5};
        int target1 = 8;
        int ret2 = 0;
        ret2 = solution.threeSumMulti(A1, target1);
        System.out.println("ret2=" + ret2);

        //int[] A2 = new int[]{1,1,2,2,2,2};
        //int target2 = 5;


        int[] A2 = new int[1300];
        int target2 = 0;
        ret2 = solution.threeSumMulti(A2, target2);
        System.out.println("ret2=" + ret2);



    }
}
