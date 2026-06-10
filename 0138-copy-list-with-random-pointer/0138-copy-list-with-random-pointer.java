/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node temp = head;
        while(temp!=null){
            Node nxt = new Node(temp.val);
            Node right = temp.next;
            temp.next=nxt;
            nxt.next=right;
            temp=right;
        }
        temp=head;
        while(temp!=null){
            if(temp.random != null)
    temp.next.random = temp.random.next;
            temp=temp.next.next;
        }
        
Node copyHead = head.next; 

Node curr = head;

while (curr != null) {
    Node copy = curr.next;   
    curr.next = copy.next;

    if (copy.next != null) {
        copy.next = copy.next.next;
    }

    curr = curr.next;
}

return copyHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna