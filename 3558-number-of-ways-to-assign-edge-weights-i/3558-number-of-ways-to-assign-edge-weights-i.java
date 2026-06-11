class Solution {
    static final long MOD = 1_000_000_007L;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            l.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            l.get(e[0]).add(e[1]);
            l.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];

        q.offer(1);
        vis[1] = true;

        int depth = -1;

        while (!q.isEmpty()) {
            depth++;
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                int curr = q.poll();

                for (int child : l.get(curr)) {
                    if (!vis[child]) {
                        vis[child] = true;
                        q.offer(child);
                    }
                }
            }
        }

        return (int) modPow(2, depth - 1);
    }

    private long modPow(long base, int exp) {
        long res = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna