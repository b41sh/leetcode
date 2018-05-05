package leetcode.findMedianSortedArrays;

// Source : https://leetcode.com/problems/find-median-sorted-arrays/
// Author : Shen Bai
// Date   : 2018-05-01

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int m0 = 0;
        int m1 = 0;
        boolean isOdd = true;
        if ((n1 + n2) % 2 == 0) {
            m0 = (n1 + n2) / 2 - 1;
            m1 = (n1 + n2) / 2;
        } else {
            m0 = (n1 + n2) / 2;
            m1 = (n1 + n2) / 2 + 1;
            isOdd = false;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int a1 = 0;
        int a2 = 0;
        int num1 = 0;
        int num2 = 0;
        int num = 0;
        boolean num1End = false;
        boolean num2End = false;
        while(i < n1 || j < n2) {
            if (i < n1) {
                num1 = nums1[i];
            } else {
                num1End = true;
            }
            if (j < n2) {
                num2 = nums2[j];
            } else {
                num2End = true;
            }
            if (!num1End && num2End) {
                i++;
                num = num1;
            } else if (num1End && !num2End) {
                j++;
                num = num2;
            } else if (num1 < num2) {
                i++;
                num = num1;
            } else {
                j++;
                num = num2;
            }

            if (isOdd && k == m0) {
                a1 = num;
            } else if (isOdd && k == m1) {
                a2 = num;
                break;
            } else if (!isOdd && k == m0) {
                a1 = num;
                break;
            }
            k++;
        }
        if (isOdd) {
            return (a1 + a2) * 1.0 / 2;
        } else {
            return a1 * 1.0;
        }
    }
}
