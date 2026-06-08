/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        Node rev = reverse(head);
        head=rev;
        Node max = rev;
        while(rev!=null){
            if(rev.data<max.data){
                max.next=rev.next;
            }    
            else{
                max=rev;
            }
            rev=rev.next;
        }
        head = reverse(head);
        return head;
        
    }
    Node reverse(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna