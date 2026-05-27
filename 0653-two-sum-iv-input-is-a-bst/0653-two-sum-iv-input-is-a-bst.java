/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    class BSTIterator {

        Stack<TreeNode> st = new Stack<>();
        boolean reverse;

        public BSTIterator(TreeNode root, boolean reverse) {
            this.reverse = reverse;
            pushAll(root);
        }

        void pushAll(TreeNode node) {

            while (node != null) {
                st.push(node);

                if (reverse)
                    node = node.right;
                else
                    node = node.left;
            }
        }

        public int next() {

            TreeNode temp = st.pop();

            if (reverse)
                pushAll(temp.left);
            else
                pushAll(temp.right);

            return temp.val;
        }
    }

    public boolean findTarget(TreeNode root, int k) {

        if (root == null)
            return false;

        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);

        int i = l.next();
        int j = r.next();

        while (i < j) {

            int sum = i + j;

            if (sum == k)
                return true;

            else if (sum < k)
                i = l.next();

            else
                j = r.next();
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna