class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 1 ; i <= nums.length ; i++)sum+=i;
        int nsum = 0;
        for(int n:nums)nsum+=n;
        return sum-nsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna