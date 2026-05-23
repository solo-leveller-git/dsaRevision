/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode pG = null;

        while (temp != null) {

            ListNode kthNode = kth(temp, k);

            if (kthNode == null) break;

            ListNode nG = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (head == temp) {
                head = kthNode;
            } else {
                pG.next = kthNode;
            }

            temp.next = nG;
            pG = temp;
            temp = temp.next;
        }

        return head;
    }

    public void reverse(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {

            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
    }

    public ListNode kth(ListNode head, int k) {

        while (head != null && --k > 0) {
            head = head.next;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna