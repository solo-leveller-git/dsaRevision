/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node floor = null;
        Node ceil = null;
        Node forc=root;
        while(root!=null){
            if(key<=root.data){
                root=root.left;
            }
            else{
                floor=root;
                root=root.right;
            }
        }
        root=forc;
        while(root!=null){
            if(key<root.data){
                ceil=root;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(floor);
        ans.add(ceil);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna