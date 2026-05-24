class Solution {

    boolean graphColoring(int V, int[][] edges, int m) {
@SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] color = new int[V];
        Arrays.fill(color, -1);

        return solve(graph, 0, color, m, V);
    }

    boolean safe(ArrayList<Integer>[] graph, int node, int[] color, int c) {

        for (int ngbr : graph[node]) {
            if (color[ngbr] == c)
                return false;
        }

        return true;
    }

    public boolean solve(ArrayList<Integer>[] graph, int i,
                         int[] color, int m, int N) {

        if (i == N)
            return true;

        for (int c = 1; c <= m; c++) {

            if (safe(graph, i, color, c)) {

                color[i] = c;

                if (solve(graph, i + 1, color, m, N))
                    return true;

                color[i] = -1;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna