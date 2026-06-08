/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        boolean even = (fast==null);
        ListNode head2;
        if(even)head2=slow;
        else head2=slow.next;
        ListNode prev = null;
        while(head2!=null){
            ListNode temp = head2.next;
            head2.next=prev;
            prev=head2;
            head2=temp;
        }
        while(prev!=null){
            if(prev.val!=head.val)return false;
            prev=prev.next;
            head=head.next;
        }
        return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna