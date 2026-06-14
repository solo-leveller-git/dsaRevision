class Solution {
    public int pairSum(ListNode head) {
        if (head.next.next == null)
            return head.val + head.next.val;

        int max = Integer.MIN_VALUE;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nGroup = slow.next;
        slow.next=null;
        ListNode reverse = reverseN(nGroup);
        while(head!=null){
            max=Math.max(max,(head.val+reverse.val));
            head=head.next;
            reverse=reverse.next;
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