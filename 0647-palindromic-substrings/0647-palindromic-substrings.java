class Solution {

    public int countSubstrings(String s) {

        int count = 0;

        // Try every index as center
        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            // Example:
            // "aba"
            //   ^
            count += expand(s, i, i);

            // Even length palindrome
            // Example:
            // "abba"
            //   ^^
            count += expand(s, i, i + 1);
        }

        return count;
    }

    public int expand(String s, int l, int r) {

        int count = 0;

        // Expand while:
        // 1. inside boundary
        // 2. characters match
        while (l >= 0 &&
               r < s.length() &&
               s.charAt(l) == s.charAt(r)) {

            // Current substring is palindrome
            count++;

            // Expand outward
            l--;
            r++;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna