class Solution {
    int res = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int[] road : roads) {
            adj.get(road[0]).add(new int[]{road[1], road[2]});
            adj.get(road[1]).add(new int[]{road[0], road[2]});
        }

        boolean[] vis = new boolean[n + 1];
        dfs(adj, vis, 1);

        return res;
    }

    void dfs(List<List<int[]>> adj, boolean[] vis, int node) {
        vis[node] = true;

        for (int[] edge : adj.get(node)) {
            res = Math.min(res, edge[1]); 

            if (!vis[edge[0]]) {
                dfs(adj, vis, edge[0]);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna