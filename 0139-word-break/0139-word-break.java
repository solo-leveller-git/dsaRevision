class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return check(s, wordDict, 0, dp);
    }

    public boolean check(String s, List<String> wordDict, int idx, int[] dp) {

        if (idx >= s.length()) return true;

        if (dp[idx] != -1) return dp[idx] == 1;

        for (String word : wordDict) {

            int l = word.length();

            if (idx + l <= s.length() &&
                s.substring(idx, idx + l).equals(word)) {

                if (check(s, wordDict, idx + l, dp)) {
                    dp[idx] = 1;
                    return true;
                }
            }
        }

        dp[idx] = 0;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna