class Solution {
    public int pairSum(ListNode head) {
        if (head.next.next == null)
            return head.val + head.next.val;

        int max = Integer.MIN_VALUE;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr = head;

        while (curr != null) {
            tail.next = new ListNode(curr.val);
            tail = tail.next;
            curr = curr.next;
        }

        ListNode reverse = reverseN(dummy.next);

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            int nodeSum = slow.val + reverse.val;
            max = Math.max(max, nodeSum);

            slow = slow.next;
            reverse = reverse.next;
            fast = fast.next.next;
        }

        return max;
    }

    public ListNode reverseN(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
        }

        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna