class Solution {
    public Node flatten(Node root) {
        return helper(root);
    }

    public Node helper(Node root) {
        if (root == null || root.next == null)
            return root;

        Node connect = helper(root.next);   // FIX 1

        return merge(root, connect);
    }

    public Node merge(Node root, Node connect) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (root != null && connect != null) {
            if (root.data < connect.data) {
                temp.bottom = root;         // FIX 2
                root = root.bottom;
            } else {
                temp.bottom = connect;      // FIX 2
                connect = connect.bottom;
            }

            temp = temp.bottom;
            temp.next = null;
        }

        while (root != null) {
            temp.bottom = root;             // FIX 2
            root = root.bottom;
            temp = temp.bottom;
            temp.next = null;
        }

        while (connect != null) {
            temp.bottom = connect;          // FIX 2
            connect = connect.bottom;
            temp = temp.bottom;
            temp.next = null;
        }

        return dummy.bottom;               // FIX 3
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna