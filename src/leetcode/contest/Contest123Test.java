package leetcode.contest.contest123;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 123
 */
public class Contest123Test {
    @Test
    public void test() {

        System.out.println("Contest123Test");

        Contest123 solution = new Contest123();

        int[] A11 = new int[]{1,2,0,0};
        int K11 = 34;
        List<Integer> ret11 = solution.addToArrayForm(A11, K11);
        for (int i = 0; i < ret11.size(); i++) {
            System.out.print(ret11.get(i) + " ");
        }
        System.out.println("");

        int[] A12 = new int[]{2,7,4};
        int K12 = 181;
        List<Integer> ret12 = solution.addToArrayForm(A12, K12);
        for (int i = 0; i < ret12.size(); i++) {
            System.out.print(ret12.get(i) + " ");
        }
        System.out.println("");

        int[] A13 = new int[]{2,1,5};
        int K13 = 806;
        List<Integer> ret13 = solution.addToArrayForm(A13, K13);
        for (int i = 0; i < ret13.size(); i++) {
            System.out.print(ret13.get(i) + " ");
        }
        System.out.println("");

        int[] A14 = new int[]{9,9,9,9,9,9,9,9,9,9};
        int K14 = 1;
        List<Integer> ret14 = solution.addToArrayForm(A14, K14);
        for (int i = 0; i < ret14.size(); i++) {
            System.out.print(ret14.get(i) + " ");
        }
        System.out.println("");


        String[] equations21 = new String[]{"a==b","b!=a"};
        boolean ret21 = solution.equationsPossible(equations21);
        System.out.println(ret21);
        Assert.assertTrue(new Boolean(ret21).equals(false));

        String[] equations22 = new String[]{"b==a","a==b"};
        boolean ret22 = solution.equationsPossible(equations22);
        System.out.println(ret22);
        Assert.assertTrue(new Boolean(ret22).equals(true));

        String[] equations23 = new String[]{"a==b","b==c","a==c"};
        boolean ret23 = solution.equationsPossible(equations23);
        System.out.println(ret23);
        Assert.assertTrue(new Boolean(ret23).equals(true));

        String[] equations24 = new String[]{"a==b","b!=c","c==a"};
        boolean ret24 = solution.equationsPossible(equations24);
        System.out.println(ret24);
        Assert.assertTrue(new Boolean(ret24).equals(false));
        
        String[] equations25 = new String[]{"c==c","b==d","x!=z"};
        boolean ret25 = solution.equationsPossible(equations25);
        System.out.println(ret25);
        Assert.assertTrue(new Boolean(ret25).equals(true));


        int X31 = 2;
        int Y31 = 3;
        int ret31 = solution.brokenCalc(X31, Y31);
        System.out.println(ret31);
        Assert.assertTrue(new Integer(ret31).equals(2));

        int X32 = 5;
        int Y32 = 8;
        int ret32 = solution.brokenCalc(X32, Y32);
        System.out.println(ret32);
        Assert.assertTrue(new Integer(ret32).equals(2));

        int X33 = 3;
        int Y33 = 10;
        int ret33 = solution.brokenCalc(X33, Y33);
        System.out.println(ret33);
        Assert.assertTrue(new Integer(ret33).equals(3));

        int X34 = 1024;
        int Y34 = 1;
        int ret34 = solution.brokenCalc(X34, Y34);
        System.out.println(ret34);
        Assert.assertTrue(new Integer(ret34).equals(1023));
    }
}
