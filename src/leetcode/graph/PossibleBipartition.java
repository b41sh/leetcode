package leetcode.graph.possibleBipartition;

// Source : https://leetcode.com/problems/possible-bipartition/
// Author : Shen Bai
// Date   : 2018-08-19

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
 *
 * Each person may dislike some other people, and they should not go into the same group.
 *
 * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
 *
 * Return true if and only if it is possible to split everyone into two groups in this way.
 *
 *
 *
 * Example 1:
 *
 * Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
 * Output: true
 * Explanation: group1 [1,4], group2 [2,3]
 * Example 2:
 *
 * Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
 * Output: false
 * Example 3:
 *
 * Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 * Output: false
 *
 *
 * Note:
 *
 * 1 <= N <= 2000
 * 0 <= dislikes.length <= 10000
 * 1 <= dislikes[i][j] <= N
 * dislikes[i][0] < dislikes[i][1]
 * There does not exist i != j for which dislikes[i] == dislikes[j].
 *
 */
public class PossibleBipartition {

    // dfs timeout
    public boolean possibleBipartition0(int N, int[][] dislikes) {

        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();

        return _possibleBipartition(setA, setB, 0, dislikes);
    }

    private boolean _possibleBipartition(Set<Integer> setA, Set<Integer> setB, int start, int[][] dislikes) {
        if (start >= dislikes.length) {
            return true;
        }
        for (int i = start; i < dislikes.length; i++) {
            int a = dislikes[i][0];
            int b = dislikes[i][1];
            if ((setA.contains(a) && setA.contains(b)) || (setB.contains(a) && setB.contains(b))) {
                return false;
            } else if (setA.contains(a) && !setB.contains(b)) {
                setB.add(b);
            } else if (setA.contains(b) && !setB.contains(a)) {
                setB.add(a);
            } else if (!setA.contains(a) && setB.contains(b)) {
                setA.add(a);
            } else if (!setA.contains(b) && setB.contains(a)) {
                setA.add(b);
            } else {
                Set<Integer> setA2 = new HashSet<Integer>(setA);
                Set<Integer> setB2 = new HashSet<Integer>(setB);
                setA.add(a);
                setB.add(b);
                System.out.println("try" + a + "  " + b);
                boolean ret1 = _possibleBipartition(setA, setB, i + 1, dislikes);
                if (ret1) {
                    return true;
                } else {
                    setA2.add(b);
                    setB2.add(a);
                    boolean ret2 = _possibleBipartition(setA2, setB2, i + 1, dislikes);
                    return ret2;
                }
            }
        }

        return true;
    }


    private List<Integer>[] graph;
    private Map<Integer, Integer> color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < dislikes.length; i++) {
            graph[dislikes[i][0]].add(dislikes[i][1]);
            graph[dislikes[i][1]].add(dislikes[i][0]);
        }

        color = new HashMap<Integer, Integer>();

        for (int i = 1; i <= N; i++) {
            if (!color.containsKey(i) && !dfs(i, 0)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int i, int c) {
        if (color.containsKey(i)) {
            return color.get(i) == c;
        }
        color.put(i, c);
        for (int dis : graph[i]) {
            if (!dfs(dis, c ^ 1)) {
                return false;
            }
        }
        return true;
    }
}
