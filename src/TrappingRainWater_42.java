public class TrappingRainWater_42 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(1)
         * https://leetcode.com/problems/trapping-rain-water/
         */
        public int trap(int[] height) {
            int n = height.length;
            int left = 0;
            int right = n - 1;
            int leftMax = height[left++];
            int rightMax = height[right--];
            int water = 0;
            while (left <= right) {
                if (height[left] >= leftMax) {
                    leftMax = height[left++];
                } else if (height[right] >= rightMax) {
                    rightMax = height[right--];
                } else {
                    if (leftMax > rightMax && height[left] < leftMax) {
                        water += rightMax - height[right--];
                    } else {
                        water += leftMax - height[left++];
                    }
                }
            }
            return water;
        }
    }
}
