class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int ans = 0;
        for(int n: gain){
            max+=n;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna