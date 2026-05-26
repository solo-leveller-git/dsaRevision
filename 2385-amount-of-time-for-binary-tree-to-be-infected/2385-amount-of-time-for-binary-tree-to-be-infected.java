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
    TreeNode from = null;
    public int amountOfTime(TreeNode root, int start) {
        if (root == null || (root.left==null && root.right==null)) return 0;

        Map<TreeNode, TreeNode> parentMap = new HashMap<>();

        parent(root, parentMap, start);

        return bfs(from,parentMap);
    }
        public void parent(TreeNode root, Map<TreeNode, TreeNode> parentMap, int start) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr.val==start)from=curr;
            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                q.offer(curr.left);
            }

            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                q.offer(curr.right);
            }
        }
    }
        public int bfs(TreeNode target, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q = new LinkedList<>();

        Set<TreeNode> vis = new HashSet<>();

        q.offer(target);
        vis.add(target);

        int dist = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            dist++;
            while (size-- > 0) {
                TreeNode curr = q.poll();
                if (curr.left != null && !vis.contains(curr.left)) {
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                if (curr.right != null && !vis.contains(curr.right)) {
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                if (parentMap.containsKey(curr) && !vis.contains(parentMap.get(curr))) {
                    q.offer(parentMap.get(curr));
                    vis.add(parentMap.get(curr));
                }
            }
        }
        return dist-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna