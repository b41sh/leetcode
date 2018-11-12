package leetcode.contest.contest109;

import org.junit.Assert;
import org.junit.Test;

/**
 * Weekly Contest 109
 */
public class Contest109Test {
    @Test
    public void test() {

        System.out.println("Contest109Test");

        Contest109 solution = new Contest109();

        Contest109.RecentCounter recentCounter = new Contest109().new RecentCounter();
        int num = 0;
        num = recentCounter.ping(1);
        System.out.println(num);
        num = recentCounter.ping(100);
        System.out.println(num);
        num = recentCounter.ping(3001);
        System.out.println(num);
        num = recentCounter.ping(3002);
        System.out.println(num);


        //int N = 161;
        //int N = 4846;
        int N = 3;
        int ret = solution.knightDialer(N);
        System.out.println("ret=" + ret);

            //Assert.assertTrue(new Integer(ret).equals(2));


        //Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]



    }
}
