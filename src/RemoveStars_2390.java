public class RemoveStars_2390 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(n)
         * https://leetcode.com/problems/removing-stars-from-a-string/
         */
        public String removeStars(String s) {
            String reversed = new StringBuilder(s).reverse().toString();
            StringBuilder result = new StringBuilder();
            int i = 0;
            int skipping = 0;
            while (i < reversed.length()) {
                char current = reversed.charAt(i);
                if (skipping > 0 && current != '*') {
                    i++;
                    skipping--;
                    continue;
                }
                if (current != '*') {
                    result.append(current);
                } else {
                    skipping++;
                }
                i++;
            }
            return result.reverse().toString();
        }
    }
}
