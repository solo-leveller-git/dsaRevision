class Solution {
    Integer[][] dp;

    public int validGroups(String s) {

        int maxSum = 0;
        for(char c : s.toCharArray())
            maxSum += c - '0';

        dp = new Integer[s.length()][maxSum + 1];

        return rec(s, 0, 0);
    }

    int rec(String s, int i, int prev) {

        if(i == s.length())
            return 1;

        if(dp[i][prev] != null)
            return dp[i][prev];

        int ans = 0;
        int sum = 0;

        for(int j = i; j < s.length(); j++) {

            sum += s.charAt(j) - '0';

            if(sum >= prev) {
                ans += rec(s, j + 1, sum);
            }
        }

        return dp[i][prev] = ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna