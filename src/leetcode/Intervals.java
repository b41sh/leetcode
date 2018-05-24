package leetcode.intervals;

// Source : https://leetcode.com/problems/merge-intervals/
// Source : https://leetcode.com/problems/insert-interval/
// Author : Shen Bai
// Date   : 2018-05-24

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import leetcode.Interval;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * Example 1:
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considerred overlapping.

 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * You may assume that the intervals were initially sorted according to their start times.
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */

public class Intervals {

    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> retIntervals = new ArrayList<Interval>();
        if (intervals.size() <= 1) {
            return intervals;
        }
        intervals.sort(new CustomComparator());

        boolean merging = false;
        int mergeStart = 0;
        int mergeEnd = 0;
        int mergeIndex = 1;
        int start = 0;
        int end = 0;
        int lastStart = intervals.get(0).start;
        int lastEnd = intervals.get(0).end;
        retIntervals.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval curInterval = intervals.get(i);
            start = curInterval.start;
            end = curInterval.end;

            if (merging) {
                if (start <= mergeEnd) {
                    mergeEnd = Math.max(end, mergeEnd);
                } else {
                    Interval mergeInterval = new Interval(mergeStart, mergeEnd);
                    retIntervals.set(mergeIndex - 1, mergeInterval);
                    merging = false;
                    retIntervals.add(curInterval);
                    mergeIndex++;
                }
            } else {
                if (start <= lastEnd) {
                    mergeStart = lastStart;
                    mergeEnd = Math.max(end, lastEnd);
                    merging = true;
                } else {
                    retIntervals.add(curInterval);
                    mergeIndex++;
                }
            }

            lastStart = start;
            lastEnd = end;
        }
        if (merging) {
            Interval mergeInterval = new Interval(mergeStart, mergeEnd);
            retIntervals.set(mergeIndex - 1, mergeInterval);
        }

        return retIntervals;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> retIntervals = new ArrayList<Interval>();
        if (intervals.size() == 0) {
            retIntervals.add(newInterval);
            return retIntervals;
        }

        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            retIntervals.add(intervals.get(i));
            i++;
        }
        if (i < intervals.size()) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
        }
        retIntervals.add(newInterval);
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }
        while (i < intervals.size()) {
            retIntervals.add(intervals.get(i));
            i++;
        }
        return retIntervals;
    }

    private class CustomComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            if (i1.start > i2.start) {
                return 1;
            } else if (i1.start < i2.start) {
                return -1;
            } else {
                if (i1.end > i2.end) {
                    return 1;
                } else if (i1.end < i2.end) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}