class Solution {

    ArrayList<Integer> primeFactors(int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        while (n % 2 == 0) {
            ans.add(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {

            while (n % i == 0) {
                ans.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            ans.add(n);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna