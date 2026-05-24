class Solution {

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;
        int[] dp = new int[n];

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(i, arr, d, dp));
        }

        return ans;
    }

    public int dfs(int i, int[] arr, int d, int[] dp) {

        if (dp[i] != 0) return dp[i];

        int max = 1;

        for (int j = 1; j <= d; j++) {

            int ni = i + j;

            if (ni >= arr.length) break;

            if (arr[ni] >= arr[i]) break;

            max = Math.max(max,
                    1 + dfs(ni, arr, d, dp));
        }

        for (int j = 1; j <= d; j++) {

            int ni = i - j;

            if (ni < 0) break;

            if (arr[ni] >= arr[i]) break;

            max = Math.max(max,
                    1 + dfs(ni, arr, d, dp));
        }

        return dp[i] = max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna