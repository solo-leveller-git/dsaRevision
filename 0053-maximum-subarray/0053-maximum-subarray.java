class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0)sum=0;
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna