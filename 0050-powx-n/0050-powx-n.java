class Solution {
    public double myPow(double x, int n) {
        long exp = n;

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= x;
            }

            x *= x;
            exp >>= 1;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna