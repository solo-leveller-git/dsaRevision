class Solution {
    
    boolean graphColoring(int v, int[][] edges, int m) {
        
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

        for(int i = 0; i < v; i++) {
            l.add(new ArrayList<>());
        }

        for(int[] e : edges) {
            int u = e[0];
            int w = e[1];

            l.get(u).add(w);
            l.get(w).add(u);
        }

        int[] vis = new int[v];
        Arrays.fill(vis, -1);

        return helper(l, m, vis, 0);
    }

    boolean helper(ArrayList<ArrayList<Integer>> l,
                   int m,
                   int[] vis,
                   int node) {

        if(node == vis.length) {
            return true;
        }

        for(int color = 1; color <= m; color++) {

            if(isSafe(node, color, l, vis)) {

                vis[node] = color;

                if(helper(l, m, vis, node + 1)) {
                    return true;
                }

                vis[node] = -1;
            }
        }

        return false;
    }

    boolean isSafe(int node,
                   int color,
                   ArrayList<ArrayList<Integer>> l,
                   int[] vis) {

        for(int neigh : l.get(node)) {
            if(vis[neigh] == color) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna