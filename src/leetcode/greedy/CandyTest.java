package leetcode.greedy.candy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 135. Candy
 */
public class CandyTest {

    @Test
    public void test() {

        System.out.println("CandyTest");

        Candy solution = new Candy();

        int[] ratings = new int[]{1, 0, 2};
        int ret = 0;
        ret = solution.candy(ratings);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(5));

        int[] ratings1 = new int[]{1, 2, 2};
        ret = solution.candy(ratings1);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(4));

        int[] ratings2 = new int[]{7,6,5,4,3,2,1,0};
        ret = solution.candy(ratings2);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(36));

        int[] ratings3 = new int[]{1,3,4,5,2};
        ret = solution.candy(ratings3);
        System.out.println(ret);
        Assert.assertTrue(new Integer(ret).equals(11));

    }
}


