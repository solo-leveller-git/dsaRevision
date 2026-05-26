class Solution {

    class Pair {
        TreeNode node;
        long idx;

        Pair(TreeNode node, long idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int ans = 0;

        while(!q.isEmpty()) {

            int size = q.size();

            long first = q.peek().idx;
            long last = first;

            for(int i = 0; i < size; i++) {

                Pair p = q.poll();

                TreeNode node = p.node;
                long idx = p.idx;

                last = idx;

                if(node.left != null) {
                    q.offer(new Pair(node.left, 2 * idx + 1));
                }

                if(node.right != null) {
                    q.offer(new Pair(node.right, 2 * idx + 2));
                }
            }

            ans = Math.max(ans, (int)(last - first + 1));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna