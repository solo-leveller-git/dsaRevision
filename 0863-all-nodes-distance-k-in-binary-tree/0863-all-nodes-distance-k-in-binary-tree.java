/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        Map<TreeNode, TreeNode> parentMap = new HashMap<>();

        parent(root, parentMap);

        return bfs(target, k, parentMap);
    }

    public void parent(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

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

    public List<Integer> bfs(TreeNode target, int k, Map<TreeNode, TreeNode> parentMap) {
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        Set<TreeNode> vis = new HashSet<>();

        q.offer(target);
        vis.add(target);

        int dist = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            if (dist == k) break;

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

        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna