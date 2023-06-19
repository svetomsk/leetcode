public class RemoveStart_2390 {
    class Solution {
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
