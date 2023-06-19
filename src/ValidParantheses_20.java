import java.util.*;

public class ValidParantheses_20 {
    class Solution {
        /**
         * Time complexity O(n)
         * Space complexity O(n)
         */
        public boolean isValid(String s) {
            LinkedList<Character> q = new LinkedList<>();
            q.add(s.charAt(0));
            Set<Character> opening = new HashSet<>() {{
                add('(');
                add('{');
                add('[');
            }};
            Map<Character, Character> pairs = new HashMap<>() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};
            for (int i = 1; i < s.length(); i++) {
                Character current = s.charAt(i);
                if (opening.contains(current)) {
                    q.add(current);
                } else {
                    if (q.size() == 0) return false;
                    Character last = q.pollLast();
                    if (last != pairs.get(current)) return false;
                }
            }
            return q.size() == 0;
        }
    }
}
