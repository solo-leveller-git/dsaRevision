class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] up = new int[26];
        int[] low = new int[26];

        int ans = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {

                int idx = ch - 'a';

                if (up[idx] == -1) continue;

                low[idx]++;

                if (low[idx] > 0 && up[idx] > 0) {
                    ans++;
                    up[idx] = -1;
                }

            } else {

                int idx = ch - 'A';

                if (up[idx] == -1) continue;

                up[idx]++;

                if (low[idx] > 0 && up[idx] > 0) {
                    ans++;
                    up[idx] = -1;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna