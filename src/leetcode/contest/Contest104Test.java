package leetcode.contest.contest104;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Weekly Contest 104
 */
public class Contest104Test {
    @Test
    public void test() {

        System.out.println("Contest104Test");

        Contest104 solution = new Contest104();

        boolean ret1 = false;
        int[] deck1 = new int[]{1,2,3,4,4,3,2,1};
        ret1 = solution.hasGroupsSizeX(deck1);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        int[] deck2 = new int[]{1,1,1,2,2,2,3,3};
        ret1 = solution.hasGroupsSizeX(deck2);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(false));

        int[] deck3 = new int[]{1};
        ret1 = solution.hasGroupsSizeX(deck3);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(false));

        int[] deck4 = new int[]{1,1};
        ret1 = solution.hasGroupsSizeX(deck4);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        int[] deck5 = new int[]{1,1,2,2,2,2};
        ret1 = solution.hasGroupsSizeX(deck5);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        int[] deck6 = new int[]{0,0,0,0,1,1,2,2,3,3};
        ret1 = solution.hasGroupsSizeX(deck6);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));

        int[] deck7 = new int[]{1,1,1,1,2,2,2,2,2,2};
        ret1 = solution.hasGroupsSizeX(deck7);
        System.out.println(ret1);
        Assert.assertTrue(new Boolean(ret1).equals(true));


        int ret2 = 0;
        int[] A1 = new int[]{5,0,3,8,6};
        ret2 = solution.partitionDisjoint(A1);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(3));

        int[] A2 = new int[]{1,1,1,0,6,12};
        ret2 = solution.partitionDisjoint(A2);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(4));

        int[] A3 = new int[]{32,57,24,19,0,24,49,67,87,87};
                           //0  1  2  3  4 5  6  7  8  9
        ret2 = solution.partitionDisjoint(A3);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(7));


        int[] A4 = new int[]{1,1};
        ret2 = solution.partitionDisjoint(A4);
        System.out.println("ret2=" + ret2);
        Assert.assertTrue(new Integer(ret2).equals(1));


        String[] A31 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B31 = new String[]{"e","o"};
        List<String> ret31 = solution.wordSubsets(A31, B31);
        System.out.println(ret31);

        String[] A32 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B32 = new String[]{"l","e"};
        List<String> ret32 = solution.wordSubsets(A32, B32);
        System.out.println(ret32);

        String[] A33 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B33 = new String[]{"e","oo"};
        List<String> ret33 = solution.wordSubsets(A33, B33);
        System.out.println(ret33);

        String[] A34 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B34 = new String[]{"lo","eo"};
        List<String> ret34 = solution.wordSubsets(A34, B34);
        System.out.println(ret34);

        String[] A35 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B35 = new String[]{"ec","oc","ceo"};
        List<String> ret35 = solution.wordSubsets(A35, B35);
        System.out.println(ret35);



    }
}
