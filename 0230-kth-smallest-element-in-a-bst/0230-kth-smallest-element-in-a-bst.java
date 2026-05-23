class Solution {

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    public void dfs(TreeNode root, int k) {

        if (root == null) return;

        dfs(root.left, k);

        if (count >= k) return;

        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        dfs(root.right, k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna