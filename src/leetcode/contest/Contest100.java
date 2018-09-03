package leetcode.contest.contest100;

// Source : https://leetcode.com/contest/weekly-contest-100
// Author : Shen Bai
// Date   : 2018-09-03

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
 * Weekly Contest 100
 *
 */
public class Contest100 {

    public boolean isMonotonic(int[] A) {
        if (A.length <= 2) {
            return true;
        }

        boolean isMonotonic = true;
        int direct = 0;
        int pre = A[0];
        for (int i = 1; i < A.length; i++) {
            if (direct == 0) {
                if (A[i] > pre) {
                    direct = 1;
                } else if (A[i] < pre) {
                    direct = 2;
                }
            } else if (direct == 1) {
                if (A[i] < pre) {
                    isMonotonic = false;
                    break;
                }
            } else {
                if (A[i] > pre) {
                    isMonotonic = false;
                    break;
                }
            }
            pre = A[i];
        }
        return isMonotonic;
    }

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode prev = increasingBST(root.left);
        TreeNode next = increasingBST(root.right);
        root.left = null;
        TreeNode head = root;
        if (prev != null) {
            head = prev;
            while (prev.right != null) {
                prev = prev.right;
            }
            prev.right = root;
        }
        root.right = next;

        return head;
    }

    // Time: 0.446
    public int subarrayBitwiseORs0(int[] A) {
        if (A == null) {
            return 0;
        }
        int len = A.length;
        if (len == 1) {
            return 1;
        }
        int[][] dp = new int[len][len];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i == j) {
                    dp[i][j] = A[j];
                } else {
                    dp[i][j] = dp[i][j - 1] | A[j];
                }
                set.add(dp[i][j]);
            }
        }
        /**
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }
*/
        return set.size();
    }

    // Time: 0.324
    public int subarrayBitwiseORs1(int[] A) {
        if (A == null) {
            return 0;
        }
        int len = A.length;
        if (len == 1) {
            return 1;
        }
        int[] dp = new int[len];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[j] = dp[j] | A[i];
                set.add(dp[j]);
            }
        }
        return set.size();
    }

    // Time: 0.03
    public int subarrayBitwiseORs(int[] A) {
        if (A == null) {
            return 0;
        }
        int len = A.length;
        if (len == 1) {
            return 1;
        }
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> cur = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            Set<Integer> next = new HashSet<Integer>();
            next.add(A[i]);
            for (int a : cur) {
                next.add(a | A[i]);
            }
            set.addAll(next);
            cur = next;
        }
        return set.size();
    }

    // error ans
    public String orderlyQueue0(String S, int K) {

        int[] cnts = new int[26];
        int[] preCnts = new int[26];
        for (int i = 0; i < S.length(); i++) {
            int n = S.charAt(i) - 'a';
            cnts[n]++;
            if (i < K) {
                preCnts[n]++;
            }
        }

        int ptr = K;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += preCnts[i];
            if (preCnts[i] == cnts[i]) {
                continue;
            } else {
                while (preCnts[i] < cnts[i]) {
                    for (int j = i + 1; j < 26; j++) {
                        if (preCnts[j] > 0) {
                            preCnts[j]--;
                            char c = 'a';
                            c += j;
                            char[] cc = new char[]{c};
                            S = S.concat(new String(cc));
                            int n = S.charAt(ptr) - 'a';
                            preCnts[n]++;
                            ptr++;
                            if (n == i) {
                                count++;
                            }
                            break;
                        }
                    }
                    if (count == K) {
                        break;
                    }
                }
            }
            if (count >= K) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (preCnts[i] > 0) {
                char c = 'a';
                c += i;
                sb.append(c);
                preCnts[i]--;
            }
        }
        for (int i = ptr; i < S.length(); i++) {
            sb.append(S.charAt(i));
        }

        return sb.toString();
    }

    public String orderlyQueue(String S, int K) {
        if (K > 1) {
            char[] c = S.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }

        String ans = S;
        for (int i = 1; i < S.length(); i++) {
            String tmp = S.substring(i) + S.substring(0, i);
            if (tmp.compareTo(ans) < 0) {
                ans = tmp;
            }
        }

        return ans;
    }
}
