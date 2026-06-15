class Solution {
    Integer[][] dp;

    public int minimumCost(int[] cost, int w) {
        dp = new Integer[cost.length + 1][w + 1];

        int ans = helper(cost, w, 0);

        return ans >= 1e9 ? -1 : ans;
    }

    public int helper(int[] cost, int w, int i) {
        if (w == 0) return 0;

        if (w < 0 || i >= cost.length) return (int)1e9;

        if (dp[i][w] != null) return dp[i][w];

        int take = (int)1e9;
        if (cost[i] != -1) {
            take = cost[i] + helper(cost, w - (i + 1), i);
        }

        int skip = helper(cost, w, i + 1);

        return dp[i][w] = Math.min(take, skip);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna