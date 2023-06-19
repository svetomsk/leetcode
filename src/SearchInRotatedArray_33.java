public class SearchInRotatedArray_33 {
    static class Solution {
        /**
         * Time complexity O(log(n))
         * Space complexity O(1)
         * https://leetcode.com/problems/search-in-rotated-sorted-array/
         */
        public int search(int[] nums, int target) {
            int k = findShiftPlace(nums);

            int result = -1;
            // result = Arrays.binarySearch(nums, k, nums.length, target);
            result = binarySearch(nums, k, nums.length, target);
            if (result >= 0) return result;
            // result = Arrays.binarySearch(nums, 0, k, target);
            result = binarySearch(nums, 0, k, target);
            if (result >= 0) return result;
            return -1;
        }

        public int findShiftPlace(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            if (arr[left] <= arr[right]) return 0;
            while (left <= right) {
                int middle = (right + left) / 2;
                if (arr[left] > arr[middle] && arr[middle] < arr[right]) {
                    right = middle;
                } else if (arr[left] < arr[middle] && arr[middle] > arr[right]) {
                    left = middle;
                } else {
                    if (right - left == 1) {
                        return left + 1;
                    }
                    left = middle;
                }
            }
            return -1;
        }

        public int binarySearch(int[] arr, int from, int to, int target) {
            if (from >= to) return -1;
            int middle = (from + to) / 2;
            if (arr[middle] == target) return middle;
            if (arr[middle] < target) return binarySearch(arr, middle + 1, to, target);
            return binarySearch(arr, from, middle, target);
        }
    }
}
