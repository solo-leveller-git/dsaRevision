class Solution {

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int left = countl(root);
        int right = countr(root);

        if (left == right) {
            return (2 << left) - 1;
        }
            else
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int countl(TreeNode root) {
        int count = 0;

        while (root.left != null) {
            count++;
            root = root.left;
        }

        return count;
    }

    public int countr(TreeNode root) {
        int count = 0;

        while (root.right != null) {
            count++;
            root = root.right;
        }

        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna