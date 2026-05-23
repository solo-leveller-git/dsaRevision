class Solution {

    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }

        double temp = 1;

        while (N > 0) {

            if ((N & 1) == 1) {
                temp *= x;
            }

            x *= x;
            N >>= 1;
        }

        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna