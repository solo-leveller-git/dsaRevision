class Solution {

    public int countPrimes(int n) {

        boolean[] nonPrime = new boolean[n];

        int ans = 0;

        for (int i = 2; i < n; i++) {

            if (!nonPrime[i]) {

                ans++;

                if ((long)i * i < n) {

                    for (int j = i * i; j < n; j += i) {
                        nonPrime[j] = true;
                    }
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna