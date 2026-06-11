class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long pe = power(5, even);
        long po = power(4, odd);

        return (int)((pe * po) % MOD);
    }

    private long power(long x, long n) {
        if (n == 0) return 1;

        long half = power(x, n / 2);
        long ans = (half * half) % MOD;

        if ((n & 1) == 1) {
            ans = (ans * x) % MOD;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna