class Solution {
    private int ans = 0;

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, adj, vis, component);

                int size = component.size();
                boolean complete = true;

                for (int node : component) {
                    if (adj.get(node).size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete) ans++;
            }
        }

        return ans;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> component) {
        vis[node] = true;
        component.add(node);

        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis, component);
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna