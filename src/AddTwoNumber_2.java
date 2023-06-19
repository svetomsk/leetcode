public class AddTwoNumber_2 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int overhead = 0;
            ListNode root = new ListNode(-1);
            ListNode lastElement = root;
            while (l1 != null && l2 != null) {
                int current = l1.val + l2.val + overhead;
                lastElement.next = new ListNode(current % 10);
                lastElement = lastElement.next;
                overhead = current / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1 != null || l2 != null) {
                ListNode number = (l1 == null) ? l2 : l1;
                while (number != null) {
                    int current = number.val + overhead;
                    lastElement.next = new ListNode(current % 10);
                    lastElement = lastElement.next;
                    overhead = current / 10;
                    number = number.next;
                }
            }
            if (overhead > 0) {
                lastElement.next = new ListNode(overhead);
            }
            return root.next;
        }
    }
}
