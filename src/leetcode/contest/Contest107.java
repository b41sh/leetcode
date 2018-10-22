package leetcode.contest.contest107;

// Source : https://leetcode.com/contest/weekly-contest-107
// Author : Shen Bai
// Date   : 2018-10-22

/**
 * Weekly Contest 107
 *
 */
public class Contest107 {

    public boolean isLongPressedName(String name, String typed) {

        if (typed.length() < name.length()) {
            return false;
        }

        int i = 1;
        int j = 1;
        char preN = name.charAt(0);
        char preT = typed.charAt(0);
        if (preN != preT) {
            return false;
        }
        while (i < name.length() && j < typed.length()) {
            char currN = name.charAt(i);
            char currT = typed.charAt(j);
            if (currT != currN) {
                if (currT != preN) {
                    return false;
                } else {
                    j++;
                }
            } else {
                preN = currN;
                preT = currT;
                i++;
                j++;
            }
        }
        if (i < name.length()) {
            return false;
        }
        while (j < typed.length()) {
            char t = typed.charAt(j);
            if (t != preT) {
                return false;
            }
            j++;
        }

        return true;
    }

    public int minFlipsMonoIncr(String S) {

        int leftZero = 0;
        int leftOne = 0;
        int rightZero = 0;
        int rightOne = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                rightZero++;
            } else {
                rightOne++;
            }
        }
        int minFlips = rightZero;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                leftZero++;
                rightZero--;
            } else {
                leftOne++;
                rightOne--;
            }
            int flips = leftOne + rightZero;
            minFlips = Math.min(flips, minFlips);
        }
        return minFlips;
    }


    public int[] threeEqualParts(int[] A) {

        int oneCnts = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                oneCnts++;
            }
        }
        int[] ret = new int[]{-1, -1};
        if (oneCnts == 0) {
            ret[0] = 0;
            ret[1] = A.length - 1;
            return ret;
        } else if (oneCnts % 3 != 0) {
            return ret;
        }

        int oneCnt = oneCnts / 3;
        int lastZeroCnt = 0;
        for (int k = A.length - 1; k >= 0; k--) {
            if (A[k] == 1) {
                break;
            }
            lastZeroCnt++;
        }
        int i = 0;
        int j = 0;
        int cnt = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] == 1) {
                cnt++;
                if (cnt == oneCnt) {
                    i = k + lastZeroCnt;
                } else if (cnt == oneCnt * 2) {
                    j = k + lastZeroCnt + 1;
                    break;
                }
            }
        }

        int ii = i;
        int jj = j - 1;
        int kk = A.length - 1;
        cnt = 0;
        while (ii >= 0) {
            if (A[ii] != A[jj] || A[ii] != A[kk]) {
                return ret;
            }
            if (A[ii] == 1) {
                cnt++;
                if (cnt == oneCnt) {
                    break;
                }
            }
            ii--;
            jj--;
            kk--;
        }
        ret[0] = i;
        ret[1] = j;
        return ret;
    }
}
