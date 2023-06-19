public class SortedArrayToBST_108 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(n)
         * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
         */
        public TreeNode sortedArrayToBST(int[] nums) {
            return constructTree(nums, 0, nums.length - 1);
        }

        public TreeNode constructTree(int[] nums, int left, int right) {
            if (left > right) return null;
            int middle = left + (right - left) / 2;
            TreeNode current = new TreeNode(nums[middle]);
            current.left = constructTree(nums, left, middle - 1);
            current.right = constructTree(nums, middle + 1, right);
            return current;
        }
    }
}
