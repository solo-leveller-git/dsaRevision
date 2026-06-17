class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);     

                while (n % i == 0) {
                    n /= i;      
                }
            }
        }

        if (n > 1) ans.add(n);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna