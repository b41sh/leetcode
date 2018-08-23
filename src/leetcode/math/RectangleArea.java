package leetcode.math.rectangleArea;

// Source : https://leetcode.com/problems/rectangle-area/
// Author : Shen Bai
// Date   : 2018-08-23

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 *
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 *
 * Rectangle Area
 *
 * Example:
 *
 * Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
 * Output: 45
 * Note:
 *
 * Assume that the total area is never beyond the maximum possible value of int.
 */

public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        int area = (C - A) * (D - B) + (G - E) * (H - F);
        if (C <= E || A >= G || B >= H || D <= F) {
            return area;
        }

        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int bottom = Math.max(B, F);
        int top = Math.min(D, H);
        area -= (right - left) * (top - bottom);
        return area;
    }
}
