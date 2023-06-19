public class SearchInRotatedArray_33 {
    class Solution {
        public int search(int[] nums, int target) {
            int k = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    k = i;
                    break;
                }
            }

            int result = -1;
            // result = Arrays.binarySearch(nums, k, nums.length, target);
            result = binarySearch(nums, k, nums.length, target);
            if (result >= 0) return result;
            // result = Arrays.binarySearch(nums, 0, k, target);
            result = binarySearch(nums, 0, k, target);
            if (result >= 0) return result;
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
