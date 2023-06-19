public class RotateString_796 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(n)
         * https://leetcode.com/problems/rotate-string/
         */
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length()) return false;
            return (s + s).contains(goal);
        }
    }
}
