package leetcode.maxArea;

// Source : https://leetcode.com/problems/container-with-most-water/
// Author : Shen Bai
// Date   : 2018-05-04

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
public class MaxArea {


    public int maxArea(int[] height) {

        int w = 0;
        int h = 0;
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int maxArea = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                h = height[left];
            } else {
                h = height[right];
            }
            w = right - left;
            area = h * w;
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }


    public int maxArea0(int[] height) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        int w = 0;
        int h = 0;
        int area = 0;
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            y1 = height[i];
            for (int j = i + 1; j < height.length; j++) {
                y2 = height[j];
                System.out.println("i=" + i + " j=" + j + " y1=" + y1 + " y2=" + y2);
                if (y1 < y2) {
                    h = y1;
                } else {
                    h = y2;
                }
                w = j - i;
                area = w * h;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }


    public int maxArea1(int[] height) {
        int y1 = 0;
        int y2 = 0;
        int h = 0;
        int w = 0;
        int leftX = 0;
        int rightX = 0;
        int area = 0;
        int maxArea = 0;
        int l = height.length;

        for (int i = 0; i < l; i++) {
            y1 = height[i];
            if (y1 == 0) {
                continue;
            }
            w = (maxArea + 1) / y1;
            if ((maxArea + 1) % y1 > 0) {
                w++;
            }
            leftX = i - w;
            rightX = i + w;
            for (int j = 0; j <= leftX; j++) {
                y2 = height[j];
                if (y2 >= y1) {
                    w = i - j;
                    area = w * y1;
                    if (area >= maxArea) {
                        maxArea = area;
                    }
                    break;
                }
            }
            for (int k = l - 1; k >= rightX; k--) {
                y2 = height[k];
                if (y2 >= y1) {
                    w = k - i;
                    area = w * y1;
                    if (area >= maxArea) {
                        maxArea = area;
                    }
                    break;
                }
            }
        }

        return maxArea;
    }

}
