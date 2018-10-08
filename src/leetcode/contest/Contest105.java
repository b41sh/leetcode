package leetcode.contest.contest105;

// Source : https://leetcode.com/contest/weekly-contest-105
// Author : Shen Bai
// Date   : 2018-10-07

import java.util.LinkedList;
import java.util.Queue;
import leetcode.TreeNode;

/**
 * Weekly Contest 105
 *
 */
public class Contest105 {

    public String reverseOnlyLetters(String S) {

        if (S == null || S.length() <= 1) {
            return S;
        }
        int i = 0;
        int j = S.length() - 1;
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        while (i <= j) {
            char a = S.charAt(i);
            char b = S.charAt(j);
            if (i == j) {
                sba.append(a);
                break;
            }
            if (!(a >= 'a' && a <= 'z') && !(a >= 'A' && a <= 'Z')) {
                sba.append(a);
                i++;
                continue;
            }
            if (!(b >= 'a' && b <= 'z') && !(b >= 'A' && b <= 'Z')) {
                sbb.append(b);
                j--;
                continue;
            }
            sba.append(b);
            sbb.append(a);
            i++;
            j--;
        }
        sba.append(sbb.reverse());
        return sba.toString();
    }

    public int maxSubarraySumCircular(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        int max = kadane(A);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            A[i] = -A[i];
        }
        if (max < 0) {
            return max;
        }
        int subMin = kadane(A);
        return Math.max(max, sum + subMin);
    }

    /**
     * kadane Kadane's algorithm
     * https://en.wikipedia.org/wiki/Maximum_subarray_problem
     */
    private int kadane(int[] A) {
        int maxSoFar = A[0];
        int maxEndingHere = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public class CBTInserter {

        private TreeNode tree;
        private Queue<TreeNode> queue;

        public CBTInserter(TreeNode root) {
            this.tree = root;
            this.queue = new LinkedList<TreeNode>();
            this.queue.offer(root);

            while (true) {
                TreeNode peek = this.queue.peek();
                if (peek.left != null) {
                    this.queue.offer(peek.left);
                }
                if (peek.right != null) {
                    this.queue.offer(peek.right);
                }
                if (peek.left != null && peek.right != null) {
                    this.queue.poll();
                } else {
                    break;
                }
            }
        }

        public int insert(int v) {
            TreeNode node = new TreeNode(v);

            TreeNode peek = this.queue.peek();
            if (peek.left == null) {
                peek.left = node;
            } else if (peek.right == null) {
                peek.right = node;
            }
            this.queue.offer(node);
            if (peek.left != null && peek.right != null) {
                this.queue.poll();
            }
            return peek.val;
        }

        public TreeNode get_root() {
            return this.tree;
        }
    }

    // playlists of lenght i using j different songs
    public int numMusicPlaylists(int N, int L, int K) {

        long kMod = 1000000007l;
        long[][] dp = new long[L + 1][N + 1];
        dp[0][0] = 1l;
        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= Math.min(i, N); j++) {
                dp[i][j] = (dp[i - 1][j - 1] * (N - (j - 1)) + dp[i - 1][j] * Math.max(j - K, 0)) % kMod;
            }
        }

        return (int) dp[L][N];
    }
}
