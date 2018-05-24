package leetcode.intervals;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import leetcode.Interval;

/**
 * Test for 56. Merge Intervals
 * Test for 57. Insert Interval
 */
public class IntervalsTest {

    @Test
    public void test() {

        System.out.println("IntervalsTest");

        Intervals solution = new Intervals();

        List<Interval> intervals = new ArrayList<Interval>();

        Interval interval1 = new Interval(1, 3);
        Interval interval2 = new Interval(2, 6);
        Interval interval3 = new Interval(8, 10);
        Interval interval4 = new Interval(15, 18);

        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);

        List<Interval> retIntervals = solution.merge(intervals);

        for (int i = 0; i < retIntervals.size(); i++) {
            System.out.println(retIntervals.get(i).start + " " + retIntervals.get(i).end);
        }

        System.out.println("===============");

        List<Interval> intervals2 = new ArrayList<Interval>();

        Interval interval21 = new Interval(2, 3);
        Interval interval22 = new Interval(4, 5);
        Interval interval23 = new Interval(6, 7);
        Interval interval24 = new Interval(8, 9);
        Interval interval25 = new Interval(1, 10);

        intervals2.add(interval21);
        intervals2.add(interval22);
        intervals2.add(interval23);
        intervals2.add(interval24);
        intervals2.add(interval25);

        List<Interval> retIntervals2 = solution.merge(intervals2);

        for (int i = 0; i < retIntervals2.size(); i++) {
            System.out.println(retIntervals2.get(i).start + " " + retIntervals2.get(i).end);
        }

        System.out.println("===============");

        List<Interval> intervals3 = new ArrayList<Interval>();
        Interval interval31 = new Interval(1, 3);
        Interval interval32 = new Interval(6, 9);
        Interval newInterval3 = new Interval(2, 5);
        intervals3.add(interval31);
        intervals3.add(interval32);

        List<Interval> retIntervals3 = solution.insert(intervals3, newInterval3);

        for (int i = 0; i < retIntervals3.size(); i++) {
            System.out.println(retIntervals3.get(i).start + " " + retIntervals3.get(i).end);
        }

    }
}
