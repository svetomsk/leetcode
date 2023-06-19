public class MergeKList_23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode root = new ListNode(-1);
            int minIndex;
            ListNode lastElement = root;
            while ((minIndex = findLowest(lists)) != -1) {
                lastElement.next = lists[minIndex];
                lastElement = lastElement.next;
                lists[minIndex] = lists[minIndex].next;
            }
            return root.next;
        }

        public int findLowest(ListNode[] lists) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode current = lists[i];
                if (current != null && current.val < minValue) {
                    minValue = current.val;
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }
}
