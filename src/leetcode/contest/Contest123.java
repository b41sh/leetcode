package leetcode.contest.contest123;

// Source : https://leetcode.com/contest/weekly-contest-123
// Author : Shen Bai
// Date   : 2019-02-10
// Rank   : 1797 / 3714

import java.util.*;

/**
 * Weekly Contest 123
 * 
 */
public class Contest123 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        String ks = Integer.toString(K);
        int[] B = new int[ks.length()];
        for (int i = 0; i < ks.length(); i++) {
            B[i] = (int)(ks.charAt(i) - '0');
        }
        int i = A.length - 1;
        int j = B.length - 1;
        List<Integer> list = new ArrayList<Integer>();
        int c = 0;
        while (i >= 0 || j >= 0) {
            int a = 0;
            int b = 0;
            if (i >= 0) {
                a = A[i];
            }
            if (j >= 0) {
                b = B[j];
            }
            int n = a + b + c;
            if (n >= 10) {
                n -= 10;
                c = 1;
            } else {
                c = 0;
            }
            i--;
            j--;
            list.add(0, n);
        }
        if (c == 1) {
            list.add(0, 1);
        }
        return list;
    }
    
    public boolean equationsPossible(String[] equations) {
        int[][] graph = new int[26][26];
        for (int i = 0; i < 26; i++) {
            graph[i][i] = 1;
        }
        int[] visited = new int[26];
        int[] traverse = new int[26];
        boolean hasNew = false;
        for (int i = 0; i < equations.length; i++) {
            int k1 = (int)(equations[i].charAt(0) - 'a');
            int k2 = (int)(equations[i].charAt(3) - 'a');
            if (k1 == k2) {
                continue;
            }
            if (equations[i].charAt(1) == '=') {
                graph[k1][k2] = 1;
                graph[k2][k1] = 1;
                for (int j = 0; j < 26; j++) {
                    visited[j] = 0;
                    traverse[j] = 0;
                }
                traverse[k1] = 1;
                traverse[k2] = 1;
                while (true) {
                    hasNew = false;
                    for (int j = 0; j < 26; j++) {
                        if (traverse[j] == 1 && visited[j] == 0) {
                            visited[j] = 1;
                            for (int k = 0; k < 26; k++) {
                                if (graph[j][k] == 1) {
                                    hasNew = true;
                                    traverse[k] = 1;
                                    for (int m = 0; m < 26; m++) {
                                        if (traverse[m] == 1) {
                                            graph[m][j] = 1;
                                            graph[j][m] = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!hasNew) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < equations.length; i++) {
            int k1 = (int)(equations[i].charAt(0) - 'a');
            int k2 = (int)(equations[i].charAt(3) - 'a');
            if (equations[i].charAt(1) == '!') {
                if (graph[k1][k2] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int brokenCalc(int X, int Y) {
        int n = 0;
        while (Y > X) {
            if (Y % 2 == 0) {
                Y /= 2;
            } else {
                Y++;
            }
            n++;
        }
        n += Math.max(0, X - Y);
        return n;
    }

}

