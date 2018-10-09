package leetcode.contest.contest104;

// Source : https://leetcode.com/contest/weekly-contest-104
// Author : Shen Bai
// Date   : 2018-09-30

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import leetcode.TreeNode;

/**
 * Weekly Contest 104
 *
 */
public class Contest104 {

    public boolean hasGroupsSizeX(int[] deck) {

        if (deck == null || deck.length <= 1) {
            return false;
        }

        int[] cnts = new int[10001];
        for (int i = 0; i < deck.length; i++) {
            cnts[deck[i]]++;
        }
        
        int g = 0;
        for (int i = 0; i < cnts.length; i++) {
            g = gcd(g, cnts[i]);
        }

        return g != 1;
    }


    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }



/**
    public int partitionDisjoint(int[] A) {
        int min = A[0];
        int pos = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                pos = i;
            }
        }

    }
 */


    public int partitionDisjoint(int[] A) {

        int i = A.length - 2;
        for (; i > 0; i--) {
            if (A[i] < A[0]) {
                break;
            }
        }
        int max = A[0];
        for (int j = 1; j < i; j++) {
            max = Math.max(max, A[j]);
        }
        if (max == A[0]) {
            return i + 1;
        }
        int k = A.length - 2;
        for (; k > i; k--) {
            if (A[k] < max) {
                break;
            }
        }
        System.out.println("i=" + i);
        System.out.println("k=" + k);
        return k + 1;
    }

    // timeout
    public List<String> wordSubsets0(String[] A, String[] B) {

        int[][] words = new int[B.length][26];
        for (int i = 0; i < B.length; i++) {
            String b = B[i];
            for (int j = 0; j < b.length(); j++) {
                char c = b.charAt(j);
                words[i][c - 'a']++;
            }
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < A.length; i++) {
            String a = A[i];
            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                for (int k = 0; k < B.length; k++) {
                    words[k][c - 'a']--;
                }
            }
            boolean isSub = true;
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < 26; k++) {
                    if (words[j][k] > 0) {
                        isSub = false;
                        break;
                    }
                }
            }
            if (isSub) {
                list.add(a);
            }

            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                for (int k = 0; k < B.length; k++) {
                    words[k][c - 'a']++;
                }
            }
        }

        return list;
    }

    public List<String> wordSubsets(String[] A, String[] B) {

        int[] cnts = new int[26];
        for (int i = 0; i < B.length; i++) {
            String b = B[i];
            int[] cnt = new int[26];
            for (int j = 0; j < b.length(); j++) {
                char c = b.charAt(j);
                cnt[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                cnts[j] = Math.max(cnts[j], cnt[j]);
            }
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < A.length; i++) {
            String a = A[i];
            int[] cnt = new int[26];
            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                cnt[c - 'a']++;
            }
            boolean isSub = true;
            for (int j = 0; j < 26; j++) {
                if (cnt[j] < cnts[j]) {
                    isSub = false;
                    break;
                }
            }
            if (isSub) {
                list.add(a);
            }
        }

        return list;
    }
}

