import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(n)
         */
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            Map<Integer, Integer> values = new HashMap<>();
            for (int i = 0; i < n; i++) {
                values.put(nums[i], i);
            }
            for (int i = 0; i < n; i++) {
                int addition = target - nums[i];
                Integer maybePair = values.get(addition);
                if (maybePair != null && maybePair != i) {
                    return new int[]{i, maybePair};
                }
            }
            return new int[]{0, 1};
        }
    }
}
