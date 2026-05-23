/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        return rec(root);
        
    }
    public Node rec(Node root){
        if(root==null || root.next==null)return root;
        Node front = rec(root.next);
        return merge(root,front);
    }
    public Node merge(Node r1, Node r2){
        Node dummy = new Node(-1);
        Node res = dummy;
        while(r1!=null && r2!=null){
            if(r1.data<r2.data){dummy.bottom=r1;
                r1=r1.bottom;
            }
            else{
                dummy.bottom=r2;
                r2=r2.bottom;
            }
            dummy.next=null;
            dummy=dummy.bottom;
        }
        while(r1!=null){
            dummy.bottom=r1;
                r1=r1.bottom;
                dummy.next=null;
                dummy=dummy.bottom;
        }
        while(r2!=null){
             dummy.bottom=r2;
                r2=r2.bottom;
                dummy.next=null;
                dummy=dummy.bottom;
        }
        return res.bottom;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna