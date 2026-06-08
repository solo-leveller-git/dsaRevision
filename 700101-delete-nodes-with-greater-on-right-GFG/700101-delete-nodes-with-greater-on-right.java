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
        Node traverse = head;
        Stack<Node> st = new Stack<>();
        while(traverse!=null){
            while(!st.isEmpty() && traverse.data>st.peek().data){
                st.pop();
            }
            st.push(traverse);
            if(st.size()==1){
                head=st.peek();
            }
            else{
                Node nxt = st.pop();
                st.peek().next=nxt;
                st.push(nxt);
            }
            traverse=traverse.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna