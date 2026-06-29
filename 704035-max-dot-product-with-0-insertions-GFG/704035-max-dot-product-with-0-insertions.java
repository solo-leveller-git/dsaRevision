import java.util.Arrays;

class Solution {
    int[][] dp;

    public int maxDotProduct(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MIN_VALUE);

        return helper(a, b, n - m, 0, 0);
    }

    public int helper(int[] a, int[] b, int len, int i, int j) {

        if (j == b.length)
            return 0;

        if (i == a.length)
            return -(int)1e9;

        if (dp[i][j] != Integer.MIN_VALUE)
            return dp[i][j];

        int take = a[i] * b[j] + helper(a, b, len, i + 1, j + 1);

        int skip = -(int)1e9;
        if (len > 0)
            skip = helper(a, b, len - 1, i + 1, j);

        return dp[i][j] = Math.max(take, skip);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna