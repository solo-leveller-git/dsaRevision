class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> mp = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for (int[] r : descriptions) {

            int parent = r[0];
            int child = r[1];
            int isLeft = r[2];

            s.add(child);

            TreeNode parentNode;
            if (mp.containsKey(parent))
                parentNode = mp.get(parent);
            else
                parentNode = new TreeNode(parent);

            TreeNode childNode;
            if (mp.containsKey(child))
                childNode = mp.get(child);
            else
                childNode = new TreeNode(child);

            if (isLeft == 1)
                parentNode.left = childNode;
            else
                parentNode.right = childNode;

            mp.put(parent, parentNode);
            mp.put(child, childNode);
        }

        for (int[] r : descriptions) {
            if (!s.contains(r[0]))
                return mp.get(r[0]);
        }

        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna