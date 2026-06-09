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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode start = head;
        ListNode temp = head;
        ListNode prevTail = null;
        while(temp!=null){
            int i  = 0;
            while(temp!=null && i<k-1){
                temp=temp.next;
                i++;
            }
            if(temp==null){
                prevTail.next=start;
                break;
            }
            ListNode nextGroup = temp.next;
            temp.next=null;
            reverse(start);
            if(start==head){
                head=temp;
            }else{
                prevTail.next=temp;
            }
            temp=nextGroup;
            prevTail=start;
            start = nextGroup;
            
        }
        return head;
    }
    public void reverse(ListNode head){
        ListNode prev = null;
        ListNode curr =head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev=curr;
            curr=nxt;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna