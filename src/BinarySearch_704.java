public class BinarySearch_704 {
    class Solution {
        /**
         * Time complexity: O(log(n))
         * Space complexity: O(1)
         * https://leetcode.com/problems/binary-search/
         */
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (nums[middle] == target) return middle;
                if (nums[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            return -1;
        }
    }
}
