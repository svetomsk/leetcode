import java.util.ArrayList;
import java.util.List;

public class ValidateBSTree_78 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            List<Integer> sorted = new ArrayList<>();
            traverse(root, sorted);
            for (int i = 0; i < sorted.size() - 1; i++) {
                if (sorted.get(i) >= sorted.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }

        public void traverse(TreeNode node, List<Integer> sorted) {
            if (node == null) return;
            traverse(node.left, sorted);
            sorted.add(node.val);
            traverse(node.right, sorted);
        }
    }
}
