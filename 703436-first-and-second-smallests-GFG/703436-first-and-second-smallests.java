class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < min) {
                smin = min;
                min = n;
            } else if (n != min) {
                smin = Math.min(smin, n);
            }
        }

        ans.add(min);
        ans.add(smin);

        return (smin == Integer.MAX_VALUE)
                ? new ArrayList<>(Arrays.asList(-1))
                : ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna