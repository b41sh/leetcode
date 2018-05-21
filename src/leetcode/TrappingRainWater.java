package leetcode.trappingRainWater;

// Source : https://leetcode.com/problems/trapping-rain-water/
// Author : Shen Bai
// Date   : 2018-05-21

import java.util.Stack;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 * Example:
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }

        int area = 0;
        int lastH = 0;
        Stack<Bar> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            if (h == lastH) {
                continue;
            // put left side in stack
            } else if (h < lastH) {
                Bar bar = new Bar(i, lastH, h);
                stack.push(bar);
            // calculate in right side
            } else {
                while(!stack.empty() && stack.peek().getFloor() <= h) {
                    Bar bar = stack.pop();
                    int width = i - bar.getIndex();
                    int ceil = Math.min(bar.getCeil(), h);
                    int floor = Math.max(bar.getFloor(), lastH);
                    area += width * (ceil - floor);
                    if (bar.getCeil() > h) {
                        bar.setFloor(h);
                        stack.push(bar);
                        break;
                    }
                }
            }
            lastH = h;
        }
        return area;
    }

    private class Bar {
        private int index;
        private int ceil;
        private int floor;

        Bar(int index, int ceil, int floor) {
            this.index = index;
            this.ceil = ceil;
            this.floor = floor;
        }

        public int getIndex() {
            return this.index;
        }
        public int getCeil() {
            return this.ceil;
        }
        public int getFloor() {
            return this.floor;
        }
        public void setFloor(int floor) {
            this.floor = floor;
        }
    }
}